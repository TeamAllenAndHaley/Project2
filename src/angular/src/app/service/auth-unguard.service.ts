import { Injectable } from '@angular/core';
import { CanActivate, Router, ActivatedRouteSnapshot, RouterStateSnapshot } from 'node_modules/@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthUnguardService implements CanActivate {

  constructor(private router: Router) { }
  
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if (!localStorage.getItem('userLoggedIn')) return true;

    this.router.navigate(['/']);
    return false;    
  }
}
