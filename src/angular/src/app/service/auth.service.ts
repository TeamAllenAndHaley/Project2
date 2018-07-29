import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';
import {Observable} from "rxjs/internal/Observable";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient: HttpClient) { }

 login(id: string, pw: string) {
    let url = 'http://localhost:8100/api/login/auth';

    return this.httpClient.post(url, {
      email: id,
      password: pw
    }).subscribe(
      res => console.log(res)
    );
  }

  private newUser: boolean;
  isNewUser(id: string): boolean {
    // get password by email
    // if exists && password is empty/null
    //    return true
    // else return false
    let url = 'http://localhost:8100/api/login/new';
    this.httpClient.post<Login>(url, {
      email: id,
      password: null
    }).subscribe(res => {
      if(res.password == null) {
        this.newUser = true;
      } else {
        this.newUser = false;
      }
    });

    return this.newUser;
  }

  register(id: string, pw: string) {
    // set password for user
  }

  logout() {}
}

class Login {
  email: string;
  password: string;

  constructor(email:string, password:string) {
    this.email = email;
    this.password = password;
  }
}

