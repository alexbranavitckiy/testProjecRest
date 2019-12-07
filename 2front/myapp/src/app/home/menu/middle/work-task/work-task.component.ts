import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Service} from "../../../../shared/service";

@Component({
  selector: 'app-work-task',
  templateUrl: './work-task.component.html',
  styleUrls: ['./work-task.component.css']
})
export class WorkTaskComponent implements OnInit {


  constructor(private router: Router, private Service: Service, private service: Service) {
  }

  ngOnInit() {
  }


  goComponent(str: string) {
    this.router.navigate([str]);
  }
}
