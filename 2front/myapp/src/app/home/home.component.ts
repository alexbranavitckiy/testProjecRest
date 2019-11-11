import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {AuthService} from "../shared/AuthService";
import {Component, OnInit, TemplateRef} from "@angular/core";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {ModalService} from "../shared/modalService";
import {Service} from "../shared/service";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
username:string;

constructor(private  modalServ:ModalService,private authService: AuthService,private http: HttpClient,
  private router: Router,private service :Service) {
}


onLogin (template: TemplateRef<any>){
  this.modalServ._openModal(template);
this.authService.login('12','12');
}


ngOnInit() {
}


}
