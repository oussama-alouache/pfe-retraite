import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { LoginService } from '../servicess/login.service';
import { AuthgradService } from './authgrad.service';

@Injectable({
  providedIn: 'root'
})
export class redirectservice   {
  role: any;




  constructor(private authService: LoginService,  private router: Router) { 

    const role = sessionStorage.getItem('role');
    const auth =  AuthgradService;


  }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    //Your redirection logic goes here

    if (this.authService.isLoggedIn()) {

      if (this.role['role'] == 'ADMIN') {
          this.router.navigate(['/user']);
      }

      if (this.role['role'] == 'MANAGER') {
          this.router.navigate(['/dashboard']);
      }
  }
 return false;

  }
}
