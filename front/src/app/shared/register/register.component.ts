import { Component, OnInit } from '@angular/core';

import { FormsModule } from "@angular/forms";
import { Router } from '@angular/router';
import { AuthService } from 'service/auth.service';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent implements OnInit {

  registerUserData = {
    name:"",
    email:"",
    password:""
  }

  ngOnInit(): void {
  }

  constructor(private _auth: AuthService,
    private _router: Router) { }


  registerUser() {
    this._auth.registerUser(this.registerUserData)
    .subscribe(
      res => {
        console.log(res);
        // localStorage.setItem('token', res.token)
        this._router.navigate(['/login'])
      },
      err => console.log(err)
    )      
  }


}
