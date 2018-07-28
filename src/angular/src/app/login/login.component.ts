import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from 'node_modules/@angular/forms';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email: FormControl = new FormControl('', [Validators.required, Validators.email]);
  password: FormControl = new FormControl('', [Validators.required]);

  constructor(private authService: AuthService) { }

  ngOnInit() {
  }

  getEmailError(): String {
    return this.email.hasError('required') ? 'email is required to login' :
        this.email.hasError('email') ? 'entered email is invalid' : '';
  }

  signIn(): void {
    console.log('signin runs!');
  }

}
