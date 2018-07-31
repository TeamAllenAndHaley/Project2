import { Component, OnInit } from '@angular/core';
import { RequestService } from '../../service/request.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  hr: boolean;
  user: any;

  constructor(private requestService: RequestService) { }

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('userLoggedIn'));
    this.hr = this.user.department !== 'Revature employee';
    console.log(this.user);
  }

}
