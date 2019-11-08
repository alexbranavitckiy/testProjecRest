import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {

  constructor(private service :Service) { }

  ngOnInit() {
  }

}
