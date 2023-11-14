import { NgModule } from '@angular/core';
import { RouterModule, Routes, mapToCanActivate } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { UserComponent } from '../page/user/user.component';
import { SidebarComponent } from '../utilities/sidebar/sidebar.component';
import { AuthgradService } from '../token/authgrad.service';
import { DashbordComponent } from '../page/dashbord/dashbord.component';
import { UserUpdateComponent } from '../page/user/user-update/user-update.component';


const routes: Routes = [
  
  { path: '', component: LoginComponent },
  { path: 'user', component: UserComponent ,canActivate: mapToCanActivate ([AuthgradService] ),data: { roles: ['ADMIN'] }   },
  { path: 'side', component: SidebarComponent },
  { path: 'dashboard', component: DashbordComponent , canActivate:  mapToCanActivate ([AuthgradService])  ,data: { roles: ['ADMIN','MANAGER']} },
  { path: 'users/:id', component: UserUpdateComponent , canActivate: mapToCanActivate ([AuthgradService] ),data: { roles: ['ADMIN']} }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }