import {Component, Input, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Service} from "../../../../../shared/service";
import {ModalService} from "../../../../../shared/modalService";
import {UserService} from "../../../../../shared/user.service";
import {TaskService} from "../../../../../shared/task.service";
import {ProjectService} from "../../../../../shared/project.service";

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  @Input() list: String[];// лист титул
  @Input() Data: String[];// входные данные
  ngOnInit() {}

  constructor(private userService :UserService,private taskService :TaskService,private projectService:ProjectService, private router: Router, private service: Service, private modalServ :ModalService) {
  }
    goComponent(str: string,index :number) {
      this.router.navigate([str]);
      console.log(index);
      console.log(this.list);
    }



}
