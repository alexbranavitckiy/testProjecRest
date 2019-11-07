import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {AuthService} from "../../shared/AuthService";



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string;

  constructor(private authService: AuthService,
              private router: Router) {
  }

  ngOnInit() {

  }


  onFormSubmit(loginForm) {
    this.authService.login(loginForm.value.username, loginForm.value.password);
    //.subscribe(data => {
     console.log( 'return to '+ loginForm.value.username);
    //  if (this.retUrl!=null) {
      //         this.router.navigate( [this.retUrl]);
      //       } else {
      //         this.router.navigate( ['home']);
      //       }
 //   });
  }
  goComponent(str:string){
    this.router.navigate([str]);
  }
}
