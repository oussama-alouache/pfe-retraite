import { ChangeDetectionStrategy, ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/entities/user/user';


import { genericcomponent } from 'src/app/generic/generic.component';
import { UserService } from 'src/app/servicess/user/user.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],

})
export class UserComponent  {
  error: boolean = false;
  user: User = new User();
 users: any[]=[];
 userid : any

  constructor(private DataService: UserService ,private router: Router,private changeDetector: ChangeDetectorRef) {}

  onSubmit() {
    this.DataService.postData(this.user).subscribe((data: any) => {
      if (data && data.access_token) {
        console.log(data)
        Swal.fire({
          icon: "success",
          title: "Your work has been saved",
          showConfirmButton: false,
          timer: 1500
        });
        window.location.reload();
      }
    }  ,  (error : any) => {
     this.error =true
    }
    );
  }

  ngOnInit(): void {

    this.getdata();
 
  }


  

  getdata(): void {
    this.DataService.getData().subscribe(
      (data) => {
        this.users = data;
  

        console.log(data);
      },
      (error) => {
        // Handle errors
        console.error('Erreur lors de la récupération des données :', error);
      }
    );

  }

  
 
  
  OnDelete(id: string) {
    Swal.fire({
      title: 'Are you sure?',
      text: "You won't be able to revert this!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!'
    }).then(result =>{
      if (result.isConfirmed) {
 
        this.DataService.deleteData(id).subscribe(

         () => {

          Swal.fire({
            icon: 'success',
            title: 'Project deleted successfully!',
            showConfirmButton: false,
            timer: 1500
          })
          window.location.reload();
        }),((error: any) => {
          Swal.fire({
            icon: 'error',
           title: 'An Error Occured!',
           showConfirmButton: false,
           timer: 1500
          })
          return error
        })
 
      }
    })  
  }







}


