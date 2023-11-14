import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class JwtInterceptor implements HttpInterceptor {
  private authToken = sessionStorage.getItem('token');

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {


    const modifiedRequest = request.clone({
      setHeaders: {
      'Authorization': `Bearer ${this.authToken}`,
        'Content-Type': 'application/json'
   
      }
    });

    return next.handle(modifiedRequest);
  }
}

