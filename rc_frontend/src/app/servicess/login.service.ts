import { Injectable } from '@angular/core';
import { varibles } from '../utilities/varibales';
import { HttpClient, HttpHeaders } from '@angular/common/http';  
import axios from 'axios';
import { Router } from '@angular/router';
import { Login } from '../entities/login';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private authToken = sessionStorage.getItem('token');
  private baseURL =varibles.baseUrl;
  private role =varibles.role;
  private logoutUrl = varibles.logout

  private token: any = sessionStorage.getItem('token');
  private userRoles: any  = 
  sessionStorage.getItem('role');

  constructor(private http: HttpClient ,private router: Router) {}


  
  isLoggedIn(): boolean {
    return !!sessionStorage.getItem('token');
  }

  getUserRoles(roles: string[]): boolean{ 
        const decodedToken :any= sessionStorage.getItem('role');
        return roles.some(role => decodedToken.includes(role));
  }
  
  getData(): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.authToken}`
    });
    return this.http.get(this.role , { headers: headers });
  }







  login(login : Login): Observable<any> {

  

    // Redirect based on role

    
    return this.http.post<Login>(this.baseURL, login);
  





  }


  logout(): Observable<any> {
    sessionStorage.removeItem('token')
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.authToken}`
    });
    return this.http.post(this.logoutUrl, {headers: headers});
  }
}

