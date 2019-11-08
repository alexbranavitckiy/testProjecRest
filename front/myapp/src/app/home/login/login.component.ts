import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {AuthService} from "../../shared/AuthService";
import {ModalService} from "../../shared/modalService";



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string;

  constructor(private authService: AuthService,
              private router: Router,private  modalServ :ModalService) {
  }

  ngOnInit() {

  }


  onFormSubmit(loginForm) {

    this.authService.login(loginForm.value.username, loginForm.value.password);

  }
  goComponent(str:string){
    this.router.navigate([str]);
  }
}
