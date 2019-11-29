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
  //  this.projectService.getAllProject().subscribe((data: Project[]) => {
  //    data.forEach((p: Project) => this.allProject.push(p));
  //  });
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


  createNewProjectValidator(control: FormControl): {[s:string]:boolean}{
      return {"nameProject": true}; }

  public createProject(): void {
//    this.projectService.getAllProject().subscribe((data: Project[]) => {
//       data.forEach((p: Project) => this.allProject.push(p));});

    console.log(this.allProject);
    this.newProject.name = this.myForm.get('nameProject').value;
    this.newProject.summary = this.myForm.get('summary').value;
   // console.log(this.allProject.indexOf(this.myForm.get('nameProject').value));
 //   console.log(this.allProject.lastIndexOf.name.indexOf(this.newProject.name ));
    // (typeof $scope.dataCheck.email !== "undefined")

   // (roles.indexOf(expectedRole) == -1);
      this.subscriptions.push(this.projectService.saveProject(this.newProject).subscribe(() => {
             this.newProject = new Project();
          }));

  //  this.allProject.lastIndexOf(this.newProject)
  //  this.allProject.push(this.newProject)
  //  console.log(this.newProject);

  }

  public searchProject(){
    this.allProject.forEach((u: Project)=> {
        if (this.newProject.name === u.name)
        stop();
      }
    )
  }

  ngOnDestroy () {}

}
