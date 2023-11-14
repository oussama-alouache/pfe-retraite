import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'rc_frontend';

  constructor(private _router: Router) { }


  navigateToFirst() {

    this._router.navigate(['login'])

  }
}
