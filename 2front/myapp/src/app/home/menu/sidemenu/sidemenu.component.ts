import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Service} from "../../../shared/service";
import {ModalService} from "../../../shared/modalService";

@Component({
  selector: 'app-sidemenu',
  templateUrl: './sidemenu.component.html',
  styleUrls: ['./sidemenu.component.css']
})
export class SidemenuComponent implements OnInit {

  constructor(private router: Router, private service: Service, private modalServ: ModalService) {
  }

  ngOnInit() {
  }

}
