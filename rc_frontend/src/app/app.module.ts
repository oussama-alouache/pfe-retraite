import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing/app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';

import { SidebarComponent } from './utilities/sidebar/sidebar.component';
import { DashbordComponent } from './page/dashbord/dashbord.component';
import { UserComponent } from './page/user/user.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient, HTTP_INTERCEPTORS } from '@angular/common/http';
import { JwtHelperService } from '@auth0/angular-jwt';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { library } from '@fortawesome/fontawesome-svg-core';
import { fas } from '@fortawesome/free-solid-svg-icons';
import { SweetAlert2Module } from '@sweetalert2/ngx-sweetalert2';
import { RequiredInputAlertDirective } from './utilities/required-input-alert.directive';
import { UserUpdateComponent } from './page/user/user-update/user-update.component';
import { JwtInterceptor } from './token/jwt-interceptor.service';

@NgModule({
  
  declarations: [
    AppComponent,
    LoginComponent,
    DashbordComponent,
    SidebarComponent,
    UserComponent,
    RequiredInputAlertDirective,
    UserUpdateComponent,
 
    
  ],
  imports: [
    
      FormsModule,
      HttpClientModule ,
    BrowserModule,
    AppRoutingModule,
    SweetAlert2Module.forRoot()
,
FontAwesomeModule  ],
  providers: [
    JwtHelperService,
     { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor() {
    // Add Font Awesome icons to the library
    library.add(fas);
  }
}