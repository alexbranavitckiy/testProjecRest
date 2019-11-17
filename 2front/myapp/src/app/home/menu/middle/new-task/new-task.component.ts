import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";
import {ModalService} from "../../../../shared/modalService";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {

  constructor(private service :Service,private  modalServ:ModalService) { }

  ngOnInit() {
  }

}
