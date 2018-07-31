import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  hr: boolean;
  user: any;

  constructor() { }

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('userLoggedIn'));
    this.hr = this.user.department !== 'Revature employee';
    console.log(this.user);
  }

}
