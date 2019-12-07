import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {ModalService} from "../../../shared/modalService";
import {AuthService} from "../../../shared/AuthService";
import {config} from "rxjs";
import {ModalConfig} from "ngb-modal";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],

})
export class LoginComponent implements OnInit {

  @Input() title: string;

  constructor(private authService: AuthService,
              private router: Router, private  modalServ: ModalService, private ngbModal: NgbModal) {

  }

  ngOnInit() {
  }


  onFormSubmit(loginForm) {
    this.authService.login(loginForm.value.username, loginForm.value.password)
    this.ngbModal.dismissAll();
  }

  goComponent(str: string) {
    this.router.navigate([str]);
  }
}
