import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AuthGuardService } from './service/auth-guard.service';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './home/dashboard/dashboard.component';
import { SubmitComponent } from './home/submit/submit.component';
import { DefaultComponent } from './login/default/default.component';
import { NewComponent } from './login/new/new.component';

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
    component: LoginComponent,
    children: [{
      path: '',
      component: DefaultComponent
    }, {
      path: 'new',
      component: NewComponent
    }]
  }];

@NgModule({
  imports:[ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
