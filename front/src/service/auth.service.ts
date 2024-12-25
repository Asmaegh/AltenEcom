import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private registUrl = "http://localhost:8081/account"
  private loginUrl = "http://localhost:8081/token";


  constructor(private http: HttpClient) { }


  registerUser(user:any) {
    return this.http.post<any>(this.registUrl, user)
  }

  loginUser(user:any) {
    return this.http.post<any>(this.loginUrl, user)
  }

  loggedIn() {
    console.log(localStorage.getItem('token'))
    return !!localStorage.getItem('token')    
  }

  getToken() {
    return localStorage.getItem('token')
  }


}
