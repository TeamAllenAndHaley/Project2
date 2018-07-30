import { Component, OnInit } from '@angular/core';
import { AuthService } from '../service/auth.service';
import { Router } from 'node_modules/@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  navigation = [{
    name: 'home',
    target: '/'
  }, {
    name: 'submit',
    target: 'submit'
  }];

  constructor(
    private authService: AuthService,
    private router: Router) { }

  ngOnInit() {
  }

  onLogout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

}
