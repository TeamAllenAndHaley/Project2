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

  logout() {}
}
