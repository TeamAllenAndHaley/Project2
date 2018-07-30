import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/service/auth.service';
import { Router } from 'node_modules/@angular/router';
import { FormControl, Validators, AbstractControl, FormGroup, FormBuilder } from 'node_modules/@angular/forms';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {

  formData: any = {};
  emailControl: FormControl = new FormControl('', [Validators.required, Validators.email]);
  // passwordForm: FormGroup = new FormGroup({
  //   password: new FormControl('', [Validators.required, this.validateConfirmPassword.bind(this)]),
  //   confirmPassword: new FormControl('', [Validators.required, this.validateConfirmPassword.bind(this)])
  // });
  passwordControl: FormControl = new FormControl();
  newUser: boolean = true; // TODO: remove

  constructor(
    private authService: AuthService,
    private router: Router,
    private builder: FormBuilder) { }

  ngOnInit() {
  }

  getEmailError(): String {
    return this.emailControl.hasError('required') ? 'email is required to login' :
        this.emailControl.hasError('email') ? 'entered input is invalid' : '';
  }

  onSubmit(): void {
    this.authService.isNewUser(this.formData.email, (data) => {
      console.log(data);
      this.newUser = (data.password) ? false : true;
      console.log(this.newUser);
    });
  }

  onPasswordSubmit(): void {
    //send password to backend with email, so that user can be looked up and password updated
    this.authService.addPassword(this.formData.email, this.formData.password);
    this.router.navigate(['/']);
    console.log("wrong register");
  }

  validateConfirmPassword() {
    let pw = this.formData.password;
    let confirm = this.formData.confirmPassword;
    console.log(pw + ', ' + confirm + ': ' + (pw === confirm));
    return (pw && confirm && pw === confirm) ? null : {
      validateConfirmPassword: {
        invalid: true
      }
    };
  }

}
