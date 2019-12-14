import {Component, Input, OnDestroy, OnInit} from '@angular/core';
import {ModalService} from "../../../../shared/modalService";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";
import {Subscription} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {ProjectService} from "../../../../shared/project.service";
import {Task} from "../../../../model/task";
import {TaskService} from "../../../../shared/task.service";
import {TaskConvector} from "../../../../model/taskConvector";

@Component({
  selector: 'app-project-view',
  templateUrl: './project-view.component.html',
  styleUrls: ['./project-view.component.css']
})
export class ProjectViewComponent implements OnInit, OnDestroy {


  private listTitleTable: String[] = []
  private id: number;
  private routeSubscription: Subscription;
  allProject: Project[] = [];
  public projectThis: Project = new Project();
  private subscriptions: Subscription[] = [];

  public allTask: TaskConvector[] = [];


  constructor(private  taskService: TaskService, private  projectService: ProjectService, private route: ActivatedRoute, private  modalServ: ModalService, private service: Service) {
  }

  ngOnInit() {
    this.routeSubscription = this.route.params.subscribe(params => this.id = params['id']);
    console.log(this.id, this.service.getIdUser())


    switch (this.service.getIdUser()) {
      case 1: {
        this.listTitleTable.push('Task code', 'User assigned', "Priority", "Status");
        this.projectService.getById(this.id).subscribe((data: Project) => {
          this.projectThis = data;
          this.id = this.projectThis.id;
          console.log(data)
        });


        this.taskService.getfindByIdInProjectConvert(this.id).subscribe((data: TaskConvector[]) => {
          data.forEach((t: TaskConvector) => this.allTask.push(t));
          console.log(data)
        });
        break
      }
      case 2: {

      }
    }
  }

  ngOnDestroy() {
    this.routeSubscription.unsubscribe();
  }


}
