import { Component } from '@angular/core';
import { LoginService } from 'src/app/servicess/login.service';
import { SidbarService } from 'src/app/servicess/sidebar/sidbar.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})


export class SidebarComponent {
  responseData: any;
  router: any;

  constructor(private dataService: SidbarService , private authService: LoginService) {}
  
  ngOnInit(): void {
    this.dataService.getData().subscribe(
      (data) => {
        this.responseData = data;
        console.log(data);
      },
      (error) => {
        // Handle errors
        console.error('Erreur lors de la récupération des données :', error);
      }
    );
  }
  

  logout() :void {
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
 
        this.authService.logout().subscribe(

         () => {

          sessionStorage.clear;
          this.router.navigate(['/login']); 
    
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

