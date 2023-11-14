import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { varibles } from 'src/app/utilities/varibales';

@Injectable({
  providedIn: 'root'
})
export class SidbarService {
  private authToken = sessionStorage.getItem('token');
  private baseURL =varibles.currentuser;
  constructor(private http: HttpClient) {}


  getData(): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.authToken}`
    });
    return this.http.get(this.baseURL , { headers: headers });
  }

  
}