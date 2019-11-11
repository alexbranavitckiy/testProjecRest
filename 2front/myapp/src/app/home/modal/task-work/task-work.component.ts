import {Component, OnInit, TemplateRef} from '@angular/core';
import {AuthService} from "../../../shared/AuthService";
import {Router} from "@angular/router";
import {ModalService} from "../../../shared/modalService";
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-task-work',
  templateUrl: './task-work.component.html',
  styleUrls: ['./task-work.component.css']
})
export class TaskWorkComponent implements OnInit {

  constructor(private authService: AuthService,private modalService: BsModalService,
              private router: Router,private  modalServ :ModalService) { }

  ngOnInit() {
  }



  onFormSubmit(loginForm) {

    this.authService.login(loginForm.value.username, loginForm.value.password);

  }
  goComponent(str:string){
    this.router.navigate([str]);
  }


}
