import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AuthGuardService } from './service/auth-guard.service';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AssociateComponent } from './home/associate/associate.component';
import { HrRepComponent } from './home/hr-rep/hr-rep.component';

const routes: Routes = [{
    path: '',
    component: HomeComponent,
    canActivate: [ AuthGuardService ],
    children: [{
      path: 'associate',
      component: AssociateComponent
    }, {
      path: 'hr',
      component: HrRepComponent
    }]
  }, {
    path: 'login',
    component: LoginComponent
  }];

@NgModule({
  imports:[ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
