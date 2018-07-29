import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/service/auth.service';
import { FormControl, Validators } from 'node_modules/@angular/forms';

@Component({
  selector: 'app-default',
  templateUrl: './default.component.html',
  styleUrls: ['./default.component.css']
})
export class DefaultComponent implements OnInit {
  formData: any = {};
  emailControl: FormControl = new FormControl('', [Validators.required, Validators.email]);
  passwordControl: FormControl = new FormControl({ disabled: true }, [Validators.required]);

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
