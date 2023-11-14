import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { LoginService } from '../servicess/login.service';

@Injectable({
  providedIn: 'root'
})
export class AuthgradService {


  
  constructor(private authService: LoginService,  private router: Router) { }
  canActivate(
    next: ActivatedRouteSnapshot,
  ):
    | Observable<boolean | UrlTree>
    | Promise<boolean | UrlTree>
    | boolean
    | UrlTree {
    if (!this.authService.isLoggedIn()) {
   
      this.router.navigate(['/']);
      return false;
    }
    // logged in, so return true
    this.authService.isLoggedIn() ;
  
    const roles = next.data['roles'] as string[];
    if (roles && roles.length > 0) {
      // Check if the user has any of the required roles from the token
      if (!this.authService.getUserRoles(roles)) {
        this.router.navigate(['/']);
        return false;
      }
    }
    console.log("is logged")
    return true;
  }
  }

