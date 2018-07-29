import { Component, OnInit } from '@angular/core';
import { Router } from 'node_modules/@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  firstLogin: boolean;
  toggleText: string = 'new user?';

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onToggleFirstLogin(): void {
    this.firstLogin = !this.firstLogin;
    
    if (this.firstLogin) {
      this.router.navigate(['/login/new']);
      this.toggleText = 'returning user?';
    } else {
      this.router.navigate(['/login']);
      this.toggleText = 'new user?';
    }
  }

}
