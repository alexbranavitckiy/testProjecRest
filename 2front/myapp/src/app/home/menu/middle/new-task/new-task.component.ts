import {Component, OnInit} from '@angular/core';
import {Service} from "../../../../shared/service";
import {ModalService} from "../../../../shared/modalService";
import {Project} from "../../../../model/project";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Task} from "../../../../model/task";
import {Observable, Subject, Subscription} from "rxjs";
import {TaskService} from "../../../../shared/task.service";
import {User} from "../../../../model/user";
import {Priority} from "../../../../model/priority";
import {Status} from "../../../../model/status";
import {UserService} from "../../../../shared/user.service";
import {ProjectService} from "../../../../shared/project.service";
import {debounceTime, map} from "rxjs/operators";
import {TaskConvector} from "../../../../model/taskConvector";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {

  user: User[] = [];


  private subscriptions: Subscription[] = [];
  public prioriti: Priority[] = [];
  public status: Status[] = [];
  public users: User[] = [];
  public newTask: TaskConvector = new TaskConvector();
  today = new Date();
  public projectNow: Project[] = [];

  constructor(private projectService: ProjectService, private userService: UserService, private taskServer: TaskService, private service: Service, private  modalServ: ModalService) {
  }

  ngOnInit() {
    this.projectService.getAllProject().subscribe((allProject: Project[]) => {
      allProject.forEach((project: Project) => this.projectNow.push(project));
    });
    console.log(this.projectNow)
    this.taskServer.getAllPriority().subscribe((data: Priority[]) => {
      data.forEach((priority: Priority) => this.prioriti.push(priority));
      console.log(this.prioriti)
    });
    this.taskServer.getAllStatus().subscribe((data: Status[]) => {
      data.forEach((status: Status) => this.status.push(status));
      console.log(this.status)
    });

    this.userService.getAllUser().subscribe((data: User[]) => {
      data.forEach((user: User) => this.user.push(user));
      console.log(this.users+'asdasdsad')
    });
  }


  public formatterUser = (result: any) => result.login;
  public searchUser = (text$: Observable<string>) =>
    text$.pipe(
      debounceTime(200),
      map(peace => peace === '' ? []
        : this.user.filter(user =>
          user.login.toLowerCase().indexOf(peace.toLowerCase()) > -1)))

  public formatterProject = (result: any) => result.name;

  public searchProject = (text$: Observable<string>) =>
    text$.pipe(
      debounceTime(200),
      map(peace => peace === '' ? []
        : this.projectNow.filter(project =>
          project.name.toLowerCase().indexOf(peace.toLowerCase()) > -1)))

  taskForm: FormGroup = new FormGroup(
    {
      "nameTask": new FormControl("", [Validators.required]),
      "projectName": new FormControl("", [Validators.required]),
      "description": new FormControl("", [Validators.required]),
      "priority": new FormControl("", [Validators.required]),
      "Status": new FormControl(""),
      "dueDate": new FormControl("", [Validators.required]),
      "estimation": new FormControl("", [Validators.required]),
      "Reporter": new FormControl("", [Validators.required]),
    }
  );


  public createNewTask(): void {
    console.log(this.taskForm)
    this.newTask.createDate=this.today;
    this.newTask.stories="Истории";
    this.newTask.project_task =this.taskForm.get("projectName").value;
    this.newTask.description = this.taskForm.get("description").value;
    this.newTask.priority_task = this.prioriti[this.taskForm.get("priority").value];
    this.newTask.status_task = this.status[this.taskForm.get("Status").value];
    this.newTask.estimation = this.taskForm.get("estimation").value;
    this.newTask.assigne = this.taskForm.get("Reporter").value;
    this.newTask.due = this.today;
    this.newTask.createDate = this.today;
    this.newTask.updateDate = this.today;
    this.newTask.closedDate = this.today;
    this.subscriptions.push(this.taskServer.saveTask(this.newTask).subscribe(() => {
     // this.newTask = new TaskConvector();
      console.log("Task created");
    }));
    console.log(this.newTask);
  }



}
