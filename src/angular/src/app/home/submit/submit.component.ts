import { Component, OnInit } from '@angular/core';
import { Router } from 'node_modules/@angular/router';

@Component({
  selector: 'app-submit',
  templateUrl: './submit.component.html',
  styleUrls: ['./submit.component.css']
})
export class SubmitComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  getUrl(): string {
    return this.router.url;
  }

}
