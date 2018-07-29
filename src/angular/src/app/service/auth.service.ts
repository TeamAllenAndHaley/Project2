import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient: HttpClient) { }

  login(id: string, pw: string) {
    console.log(id + ' ' + pw);
  }

  isNewUser(id: string): boolean {
    // get account by email
    // if exists, get password
    //    if password is empty/null, return true
    // else return false
    return true;
  }

  logout() {}
}
