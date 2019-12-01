import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";
import {ModalService} from "../../../../shared/modalService";
import {Project} from "../../../../model/project";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import validate = WebAssembly.validate;
import {NgbDate} from "@ng-bootstrap/ng-bootstrap";
import {Task} from "../../../../model/task";
import {Subscription} from "rxjs";
import {TaskService} from "../../../../shared/task.service";
import {User} from "../../../../model/user";
import {Priority} from "../../../../model/Priority";
import {Status} from "../../../../model/status";
import {UserService} from "../../../../shared/user.service";
import {ProjectService} from "../../../../shared/project.service";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {


  public newProject: Project = new Project();
  public allProject: Project[] =[];

  public newTask: Task = new Task();
  public allTask: Task[] =[];

  public allUsers: User[] =[];
  public newUsers: Project = new Project();


  public nowData: Date = new Date();

  private subscriptions: Subscription[] = [];
  today = new Date();
  date: NgbDate;





  taskForm: FormGroup=new FormGroup(
    {
      "nameTask": new FormControl("",[Validators.required]),
      "projectName": new FormControl("",[Validators.required]),
      "description": new FormControl("",[Validators.required]),
      "priority": new FormControl("",[Validators.required]),
      "status": new FormControl(""),
      "dueDate": new FormControl("",[Validators.required]),
      "estimation": new FormControl("",[Validators.required]),//предварительный расчет времени
      "assigne": new FormControl("",[Validators.required]),
      "Reporter": new FormControl("Admin"),
 }
  );



  constructor(private projectService:ProjectService, private userService:UserService,private taskServer:TaskService,private service :Service,private  modalServ:ModalService) { }

  ngOnInit() {



  }

//  id: number;
//   description: string;
//   dueData: Date;
//   estimation:number;
//
//   assigne: User;
//   codtask: string;
//   createDate: Date;
//   updateDate: Date;
//   closedDate: Date;
//   reporter: User;
//   priority: Priority;
//   project: Project;
//   comments: string;
//   stories: string;
//   attachment:string;
//   status: Status;


  public createNewTask(): void {
//    console.log(this.taskForm)
//     this.newTask.project=this.taskForm.get('projectName').value;
//     this.newTask.description="asdsad";//this.taskForm.get('description').value;
//     this.newTask.priority=this.taskForm.get('priority').value;
//     this.newTask.status=this.taskForm.get('status').value;
//     this.newTask.dueData=this.taskForm.get('dueData').value;
//     this.newTask.estimation=this.taskForm.get('estimation').value;
//     this.newTask.assigne=this.taskForm.get('assigne').value;
//     this.newTask.codtask="fdsf12";
//     this.newTask.reporter=  this.allUsers[0];
//     this.newTask.dueData=this.today;
//     this.newTask.createDate=this.today;
//     this.newTask.updateDate=this.today;
//     this.newTask.closedDate=this.today;
//     this.subscriptions.push(this.taskServer.saveTask(this.newTask).subscribe(() => {
//       this.newTask = new Task();
//       console.log("Task created");
//     })); console.log(this.newTask);
//
    this.projectService.getAllProject().subscribe((data: Project[]) => {
      data.forEach((p: Project) => this.allProject.push(p));
    });
    console.log( this.allProject );

    this.projectService.getById("12").subscribe((data: Project) => {
      ((p: Project) => this.allProject.push(p));
      console.log(data)
    });

    this.userService.getUserById("3").subscribe((data: User) => {
      ((p: User) => this.allUsers.push(p));
      console.log(data)
    });

    this.taskServer.getByIdPriority("3").subscribe((data: Priority) => {
      console.log(data)
    });

    this.taskServer.getByIdStatus("3").subscribe((data: Status) => {
      console.log(data)
    });
  }




sdf():void{


  console.log(this.taskForm)
  // this.newTask.project=this.projectService.getAllProject();
  this.newTask.description="asdsad2323";
  this.newTask.priority;
  this.newTask.status;
  this.newTask.dueData;
  this.newTask.estimation=12
  this.newTask.assigne="1";
  this.newTask.codtask="1";
  this.newTask.reporter ;



  this.subscriptions.push(this.taskServer.saveTask(this.newTask).subscribe(() => {
  this.newTask = new Task();
  console.log("Task created");
}));

console.log(this.newTask);



}


}
