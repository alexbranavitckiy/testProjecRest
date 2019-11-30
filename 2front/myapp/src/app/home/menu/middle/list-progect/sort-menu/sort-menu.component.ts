import {Component, OnInit, TemplateRef} from '@angular/core';
import {UserService} from "../../../../../shared/user.service";
import {TaskService} from "../../../../../shared/task.service";
import {ProjectService} from "../../../../../shared/project.service";
import {Router} from "@angular/router";
import {Service} from "../../../../../shared/service";
import {ModalService} from "../../../../../shared/modalService";
import {User} from "../../../../../model/user";
import {Project} from "../../../../../model/project";
import {Subscription} from "rxjs";
import {Task} from "../../../../../model/task";

@Component({
  selector: 'app-sort-menu',
  templateUrl: './sort-menu.component.html',
  styleUrls: ['./sort-menu.component.css']
})
export class SortMenuComponent implements OnInit {


  public projects: Project[];
  private subscriptions: Subscription[] = [];


  table1: string=" ";
  table2: string=" ";
  table3: string=" ";
  table4: string=" ";


  public newProject: Project = new Project();
  public allProject: Project[] =[];

  public newTask: Task = new Task();
  public allTask: Task[] =[];

  public allUsers: User[] =[];
  public newUsers: Project = new Project();


  templates: any[] = ['templates'];
  templatesUsers: any[] = ['templatesUsers'];
  templatesProject: any[] = ['templatesProject'];
  templatesTasks: any[] = ['templatesTasks'];


  constructor(private userService :UserService,private taskService :TaskService,private projectService:ProjectService, private router: Router, private service: Service, private modalServ :ModalService) {
    this.template(this.service.getIdUser() )


    this.userService.getAllUser().subscribe((data: User[]) => {
      data.forEach((user: User) => this.allUsers.push(user));
    });
  }
  ngOnInit(): void {


    this.taskService.getTask().subscribe((data: Task[]) => {
      data.forEach((t: Task) => this.allTask.push(t));
    });

    this.projectService.getAllProject().subscribe((data: Project[]) => {
      data.forEach((p: Project) => this.allProject.push(p));
    });
  }

  // ngOnInit() {
  //     this.loadBillingAccounts()// загруска таблицы
  //     this.service.fethDataBase().subscribe(() => {
  //     })
  //   }

  ngDoCheck(){

    this.template(this.service.getIdUser())}


  onLogin (template: TemplateRef<any>){
    this.modalServ._openModal(template);
  }


  public template(number: number) {
    switch (number) {
      case 1: {
        // this.templates = this.templatesProject;
        // this.templates = this.templatesProject;
        this.table1 = "Projects"
        this.table2 = " "
        this.table3 = "Status RFT"
        this.table4 = " "
        break;
        break;
      }
      case 2: {
        //  console.log(this.service.flagUserList)
        switch (this.service.flagUserList) {
          case false:{
            this.table1 = "Tasks"
            this.table2 = " "
            this.table3 = "Status RFT"
            this.table4 = " "
            //   this.templates = this.templatesProject;
            break
          }
          case true:{
            this.table1 = "Users"
            this.table2 = " "
            this.table3 = "Number of tasks"
            this.table4 = " "
            //   this.templates = this.templatesUsers;
            break
          }
        }
        break
      }
      case 3: {
        //   this.templates = this.templatesTasks;
        this.table1 = "Tasks"
        this.table2 = " "
        this.table3 = "Status RFT"
        this.table4 = "Сomments"
        break
      }
      case 4: {
        //   this.templates = this.templatesTasks;
        this.table1 = "Tasks"
        this.table2 = " "
        this.table3 = "Status RFT"
        this.table4 = "Сomments"
        break
      }
    }
  }


  public loadBillingAccounts(): void {
    // Get data from BillingAccountService
    this.subscriptions.push(this.service.getBillingAccounts().subscribe(accounts => {
      // Parse json response into local array
      this.projects = accounts as Project[];
      // Check data in console
      console.log(this.projects);// don't use console.log in angular :)
    }));
  }


  // oncChange(id :number){
  //  this.onToggle.emit(id)
  //   this.service.onToggle(id)
  // }

  goComponent(str: string) {
    this.router.navigate([str]);
  }




}


