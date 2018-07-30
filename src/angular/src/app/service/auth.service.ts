import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  newUser: boolean;

  constructor(private httpClient: HttpClient) { }

  login(id: string, pw: string) {
    let url = '/api/login/auth';

    return this.httpClient.post(url, {
      email: id,
      password: pw
    }).subscribe(res => {
      localStorage.setItem('userLoggedIn', JSON.stringify(res));
      console.log(JSON.parse(localStorage.getItem('userLoggedIn')));
    });
  }

  isNewUser(id: string, callback) {
    // get password by email
    // if exists && password is empty/null
    //    return true
    // else return false
    let url = '/api/login/new';

    return this.httpClient.post<any>(url, {
      email: id,
      password: null
    }).subscribe(
      data => callback(data)
    );
      
    //   {
    //   console.log(data);
    //   if(data.password == null) {
    //     // this.newUser = true;
    //     return true;
    //   } else {
    //     // this.newUser = false;
    //     return false;
    //   }
    // });

    // console.log('service ran');
    // return this.newUser;
  }

  register(id: string, pw: string) {
    // set password for user
  }

  addPassword(email: string, password: string) {
    //send email and password in request, update password for employee with that email
    let url = '/api/login/register';
    return this.httpClient.post(url, {
      email: email,
      password: password
    }).subscribe(res => {
      localStorage.setItem('userLoggedIn', JSON.stringify(res));
    });
  }
    
  logout() {
    localStorage.removeItem('userLoggedIn');
  }
}

class Login {
  email: string;
  password: string;

  constructor(email:string, password:string) {
    this.email = email;
    this.password = password;
  }
}

