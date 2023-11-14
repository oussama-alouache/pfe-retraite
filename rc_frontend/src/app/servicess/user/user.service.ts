import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/entities/user/user';

import { varibles } from 'src/app/utilities/varibales';

@Injectable({
  providedIn: 'root'
})

export class UserService {

  private baseURL =varibles.register;
  private UserUrl = varibles.users
  private UseridUrl = varibles.usersid
  private authToken = sessionStorage.getItem('token');




  constructor(private http: HttpClient) {}


 // Method to check if the user is logged in based on the presence of a token
 isLoggedIn(): boolean {
  return !!sessionStorage.getItem('token');
}

// Method to remove the token and log the user out
logout(): void {
  sessionStorage.removeItem('token');
  // Perform any other cleanup or redirection if needed
}






  

  postData(user : User): Observable<any> {
    return this.http.post <User>(this.baseURL, user);
  }

  getData(): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.authToken}`
    });
    return this.http.get(this.UserUrl , { headers: headers });
  }

  deleteData(id: string) {
   
    return this.http.delete(this.UserUrl +"/"+ id );
  }
  

  getDataId(id: number) {
  
    return this.http.get(this.UserUrl +"/"+ id );
  }

  updateDataId(id: number  , user : User) : Observable<Object>{ {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.authToken}`,
  

    });
    
    return this.http.get(this.UserUrl +"/"+ id ,   { headers: headers });
  }

  }

}
