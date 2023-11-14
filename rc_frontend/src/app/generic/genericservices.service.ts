import { Injectable } from '@angular/core';
import axios from 'axios';
import { varibles } from '../utilities/varibales';

@Injectable({
  providedIn: 'root'
})
export class GenericService<T> {

 baseUrl = varibles.baseUrl

  constructor() {}

  get<T>(url: string) {
    return axios.get<T>(`${this.baseUrl}/${url}`);
  }

  post<T>(url: string, data: any) {
    return axios.post<T>(`${this.baseUrl}/${url}`, data);
  }

  put<T>(url: string, data: any) {
    return axios.put<T>(`${this.baseUrl}/${url}`, data);
  }

  delete<T>(url: string) {
    return axios.delete<T>(`${this.baseUrl}/${url}`);
  }

}