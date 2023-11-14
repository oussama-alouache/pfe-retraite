import { Component, ElementRef, ViewChild } from '@angular/core';
import { LoginService } from '../servicess/login.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { Login } from '../entities/login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})


export class LoginComponent {
  email: string = '';
  password: string = '';
  error : boolean = false;
  passwordVisible: boolean = false;
  showPassword: boolean = false;

  userRoles: string[] = [];
  constructor(private authService: LoginService ,private router: Router,) {}
  
  login: Login = new Login();
  onSubmit() {
    this.authService.login(this.login).subscribe((data: any) => {
      if (data && data.access_token) {
        console.log(data)

        this.redirectBasedOnRole();
        sessionStorage.setItem('token', data.access_token);
        
        Swal.fire({
          icon: "success",
          title: "Your work has been saved",
          showConfirmButton: false,
          timer: 1500
        });
      }
    }  ,  (error : any) => {
     this.error =true
    }
    );
  }
  
  ngOnInit(): void {
    this.authService.getData().subscribe(
      (data) => {
        this.userRoles = data
        sessionStorage.setItem('role', data);
        console.log(data);
      },
      (error) => {
        // Handle errors
        console.error('Erreur lors de la récupération des données :', error);
      }
    );
  }
 
  private redirectBasedOnRole(): void {
    if (this.userRoles.includes('ADMIN')) {

      this.router.navigate(['/user']);

    } else if (this.userRoles.includes('MANAGER')) {
      
      this.router.navigate(['/dashboard']);
    } else {

      this.router.navigate(['/']);
    }
  }










  
  togglePasswordVisibility() {
    this.showPassword = !this.showPassword;
  }



}
         

