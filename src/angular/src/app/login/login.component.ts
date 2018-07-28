import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from 'node_modules/@angular/forms';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  formData: any = {};
  emailControl: FormControl = new FormControl('', [Validators.required, Validators.email]);
  passwordControl: FormControl = new FormControl('', [Validators.required]);

  constructor(private authService: AuthService) { }

  ngOnInit() {
  }

  getEmailError(): String {
    return this.emailControl.hasError('required') ? 'email is required to login' :
        this.emailControl.hasError('email') ? 'entered email is invalid' : '';
  }

  onSubmit(): void {
    this.authService.login(this.formData.email, this.formData.password);
  }

}
