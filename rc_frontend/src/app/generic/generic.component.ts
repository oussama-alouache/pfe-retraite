import { Component, Injectable, Input, OnInit } from '@angular/core';
import { GenericService } from './genericservices.service';
@Injectable({
    providedIn: 'root'
  })
export class genericcomponent <T> implements OnInit {
    constructor(private httpService: GenericService <any>) {}

  @Input() entityType: T | undefined;
  
    ngOnInit(): void {
      // Example GET request
      this.httpService.get<any>(`${this.entityType}`).then((response) => {
        console.log(response.data);
      });
  
      // Example POST request
      const data = { /* Your request data */ };
      this.httpService.post<any>(`${this.entityType}`, data).then((response) => {
        console.log(response.data);
      });
    }
  }
