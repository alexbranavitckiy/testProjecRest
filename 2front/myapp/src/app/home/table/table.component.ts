import {Component, Input, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Service} from "../../shared/service";
import {ModalService} from "../../shared/modalService";
import {Project} from "../../model/project";
import {ajaxGetJSON} from "rxjs/internal-compatibility";
import {Subscription} from "rxjs";
import {TaskConvector} from "../../model/taskConvector";
import {TaskService} from "../../shared/task.service";

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  private subscriptions: Subscription[] = [];
  @Input() list: string[];// лист титул
  @Input() Data: string[];// входные данные
 private storis:string;
  constructor(private router: Router, private service: Service, private modalServ: ModalService, private taskServer: TaskService) {
  }

  ngOnInit() {
  }


  histori(longContent, storis: string): void {
    this.storis=storis;
    console.log(storis)
    this.modalServ.openLgCentered(longContent)
  }


  Delete(Data: TaskConvector) {
    this.subscriptions.push(this.taskServer.getdeleteTask(Data.id).subscribe(() => {
      console.log(Data.id)
    }));
  }

}
