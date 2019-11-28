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

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {


  public nowData: Date = new Date();
  public newTask: Task = new Task();
  private subscriptions: Subscription[] = [];
  today = new Date();
  date: NgbDate;

  idTask: number;
  project: Project;
  ticketCode: string;
  description: string;
  priority: string;
  status: string;
  createDate: string;
  dueData: Date;
  updateDate: string;
  resolvedDate: string;
  closedDate: string;
  estimation: number;
  assigne: string;
  reporter: string;
  comments: string;
  history: string;



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




  constructor(private taskServer:TaskService,private service :Service,private  modalServ:ModalService) { }

  ngOnInit() {
  }



  public createNewTask(): void {
    console.log(this.taskForm)
    this.newTask.project=this.taskForm.get('projectName').value;
    this.newTask.project=this.taskForm.get('projectName').value;
    this.newTask.project=this.taskForm.get('projectName').value;
    this.newTask.project=this.taskForm.get('projectName').value;
    this.newTask.project=this.taskForm.get('projectName').value;
    this.newTask.project=this.taskForm.get('projectName').value;
    this.subscriptions.push(this.taskServer.saveTask(this.newTask).subscribe(() => {
      this.newTask = new Task();
      console.log("Task created");
    })); console.log(this.newTask); }

}
