import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/servicess/user/user.service';


@Component({
  selector: 'app-user-update',
  templateUrl: './user-update.component.html',
  styleUrls: ['./user-update.component.css']
})
export class UserUpdateComponent {
  id: number ; 
  data: any;

  constructor(private DataService: UserService ,private router: Router,private route: ActivatedRoute,) {}



ngOnInit(): void 
{

  this.getdatabyid();
  
  }



  getdatabyid()  : void{
    
    this.id = this.route.snapshot.params['id'];

    this.DataService.getDataId(this.id).subscribe(
      (data) => {
      
       this.data = data
        console.log(data);
      },
      (error) => {
        // Handle errors
        console.error('Erreur lors de la récupération des données :', error);
      }
    );


    console.log("hello");


}
}
