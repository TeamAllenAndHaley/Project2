import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient: HttpClient) { }

  public login(id: string, pw: string) {
    console.log(id + ' ' + pw);
    return this.httpClient.post(`http://localhost:8100/api/login/auth`, {"email":id, "password":pw});
  }

  logout() {}
}
