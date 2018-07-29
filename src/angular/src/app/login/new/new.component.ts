import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/service/auth.service';
import { Router } from 'node_modules/@angular/router';
import { FormControl, Validators } from 'node_modules/@angular/forms';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {

  formData: any = {};
  emailControl: FormControl = new FormControl('', [Validators.required, Validators.email]);


  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {
  }

  getEmailError(): String {
    return this.emailControl.hasError('required') ? 'email is required to login' :
        this.emailControl.hasError('email') ? 'entered input is invalid' : '';
  }

  onSubmit(): void {
    if (this.authService.isNewUser(this.formData.email)) {
      // switch to password/confirm password form

    }
  }

  onPasswordSubmit(): void {
    //send password to backend with email, so that user can be looked up and password updated
    this.authService.addPassword(this.formData.email, this.formData.password);
    this.router.navigate(['/']);
  }

}
