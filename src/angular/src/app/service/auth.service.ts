import { Injectable } from '@angular/core';
import { HttpClient } from 'node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient: HttpClient) { }

  public login(id: string, pw: string) {
    console.log(id + ' ' + pw);
    let url = 'http://localhost:8100/api/login/auth';
    return this.httpClient.post(url, {"email":id, "password":pw}).subscribe(
      res => console.log("test")
    );
    // return this.httpClient.get(url).subscribe(res => console.log("test"));
  }

  logout() {}
}
