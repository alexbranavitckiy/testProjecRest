import {Component, OnChanges, OnDestroy, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";
import {ProjectService} from "../../../../shared/project.service";
import {Subscription} from "rxjs";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";
import {tryCatch} from "rxjs/internal-compatibility";
import {error} from "selenium-webdriver";

@Component({
  selector: 'app-new-progect',
  templateUrl: './new-progect.component.html',
  styleUrls: ['./new-progect.component.css']
})
export class NewProgectComponent implements OnInit,OnDestroy ,OnChanges{

//
  public newProject: Project = new Project();
  public allProject: Project[] =[];
  private subscriptions: Subscription[] = [];



  ngOnChanges(){
    this.projectService.getAllProject().subscribe((data: Project[]) => {
      data.forEach((p: Project) => this.allProject.push(p));
    });
  }
  constructor( private  projectService:ProjectService,private router: Router,private service:Service) {}


  ngOnInit(): void {
  }



  myForm : FormGroup = new FormGroup({
    "nameProject": new FormControl("",[Validators.required,Validators.minLength(4), Validators.maxLength(100)]),
    "summary": new FormControl("")});

//nameProject:boolean=false;
 // public createNewProject(): void {
  //     this.nameProject=false;
  //     this.projectService.getAllProject().subscribe((data: Project[]) => {
  //       data.forEach((p: Project) => this.allProject.push(p));});
  //     this.newProject.name = this.myForm.get('nameProject').value;
  //     this.allProject.forEach((u: Project) => {
  //       if (this.newProject.name === u.name) {this.nameProject=true; stop();
  //       }
  //       console.log("работает")
  //     })
  //        if(this.nameProject){
  //     this.newProject.summary = this.myForm.get('summary').value;
  //     this.subscriptions.push(this.projectService.saveProject(this.newProject).subscribe(() => {
  //       this.allProject.push(this.newProject);
  //       this.newProject = new Project();
  //     }));
  //     console.log(this.newProject);
  //     console.log(this.myForm)
  //    }
  //
  //     }


  createNewProjectValidator2(flag:boolean,name:string): {[s:string]:boolean}{
    return {name: flag};
    }

  createNewProjectValidator(control: FormControl): {[s:string]:boolean}{
      return {"nameProject": true}; }

  ErrorNewProject:boolean= false;
  public createProject(): void {



    this.newProject.name = this.myForm.get('nameProject').value;
    this.newProject.summary = this.myForm.get('summary').value;
    if(!this.searchProject())
      this.subscriptions.push(this.projectService.saveProject(this.newProject).subscribe(() => {
        this.ErrorNewProject=false;
        this.newProject = new Project();
      }));
    this.allProject.push(this.newProject)
    console.log(this.newProject);
  }

  public searchProject():boolean{
    this.ErrorNewProject = false;
    this.allProject.forEach((u: Project)=> {
        if (this.newProject.name === u.name)
          this.ErrorNewProject = true;
        stop();
      }
    )
    return this.ErrorNewProject;
  }

  ngOnDestroy () {}

}
