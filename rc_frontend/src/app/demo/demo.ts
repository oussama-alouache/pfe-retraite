import { Injectable } from '@angular/core';
import axios from 'axios';

@Injectable({
    providedIn: 'root'
  })
  export class ApiService {
    private apiUrl = 'https://api.example.com';
  
    constructor() {}
  
    getData() {
      return axios.get(`${this.apiUrl}/data`);
    }
  
    postData(data: any) {
      return axios.post(`${this.apiUrl}/post-endpoint`, data);
    }
  }