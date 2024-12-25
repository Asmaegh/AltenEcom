import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { AuthService } from 'service/auth.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule,
    RouterModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  
  loginUserData = {
    username:"",
    password:""
  }

  ngOnInit(): void {
  }

  constructor(private _auth: AuthService,
    private _router: Router) { }



    loginUser () {
      this._auth.loginUser(this.loginUserData)
      .subscribe(
        res => {
          console.log("--1------------------------------")
          console.log(res)
          localStorage.setItem('token', res.token)
          this._router.navigate(['/products'])
          console.log("--------------------------------")
        },
        err => console.log(err)
      ) 
    }
    




}
