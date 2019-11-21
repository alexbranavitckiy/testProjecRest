import {Component, Input, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Service} from "../../shared/service";
import {ModalService} from "../../shared/modalService";
import {Project} from "../../model/project";
import {ajaxGetJSON} from "rxjs/internal-compatibility";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  @Input() list: String[];// лист титул
  @Input() Data: String[];// входные данные

  constructor(private router: Router, private service: Service, private modalServ :ModalService) {
  }
  ngOnInit() {



  }




}
