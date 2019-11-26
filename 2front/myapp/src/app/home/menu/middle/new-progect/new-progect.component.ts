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
    this.projectService.getAllProject().subscribe((data: Project[]) => {
      data.forEach((p: Project) => this.allProject.push(p));
    });
  }
//,this.createNewProjectValidator
  myForm : FormGroup = new FormGroup({
    "nameProject": new FormControl("",[Validators.required]),
    "summary": new FormControl(""),
  });
  public createNewProject(): void {

if(this.SerchNewProjectValidator){
    this.newProject.name = this.myForm.get('nameProject').value;
    this.newProject.summary = this.myForm.get('summary').value;
     this.subscriptions.push(this.projectService.saveProject(this.newProject).subscribe(() => {
             this.newProject = new Project();
           }));
        console.log(this.newProject);
    console.log(this.myForm)
}
  }

  createNewProjectValidator(control: FormControl): {[s:string]:boolean}{
      return {"nameProject": true};}

  SerchNewProjectValidator():boolean{
    this.allProject.forEach((project: Project)=> {
      if (this.newProject.name === project.name){
        return {"nameProject": false};}})
    return  true};



  ngOnDestroy () {

  }

}
