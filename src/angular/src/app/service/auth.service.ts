import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient: HttpClient) { }

 login(id: string, pw: string) {
    let url = '/api/login/auth';

    return this.httpClient.post(url, {
      email: id,
      password: pw
    }).subscribe(
      res => console.log(res)
    );
  }

  isNewUser(id: string): boolean {
    // get password by email
    // if exists && password is empty/null
    //    return true
    // else return false
    return true;
  }

  register(id: string, pw: string) {
    // set password for user
  }

  logout() {}
}
