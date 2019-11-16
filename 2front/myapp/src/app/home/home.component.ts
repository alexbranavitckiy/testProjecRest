import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {AuthService} from "../shared/AuthService";
import {Component, OnInit, TemplateRef, ViewChild} from "@angular/core";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {ModalService} from "../shared/modalService";
import {Service} from "../shared/service";
import {LoginComponent} from "./modal/login/login.component";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{





constructor(private  modalServ:ModalService,private authService: AuthService,private http: HttpClient,
  private router: Router,private service :Service) {
}

  onFormSubmit(loginForm) :boolean{
    return this.authService.login(loginForm.value.username, loginForm.value.password)
  }

ngOnInit() {
}


}
