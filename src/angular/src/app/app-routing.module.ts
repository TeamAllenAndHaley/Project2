import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AuthGuardService } from './service/auth-guard.service';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './home/dashboard/dashboard.component';
import { SubmitComponent } from './home/submit/submit.component';

const routes: Routes = [{
    path: '',
    component: HomeComponent,
    // canActivate: [ AuthGuardService ],
    children: [{
      path: '',
      component: DashboardComponent
    }, {
      path: 'submit',
      component: SubmitComponent
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
