import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";
import {ProjectService} from "../../../../shared/project.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-new-progect',
  templateUrl: './new-progect.component.html',
  styleUrls: ['./new-progect.component.css']
})
export class NewProgectComponent implements OnInit {
//private loadingService: Ng4LoadingSpinnerService

  constructor( private  projectService:ProjectService,private router: Router,private service:Service) { }
  public newProject: Project = new Project();
  public allProject: Project[] =[];
  public isNewProject: boolean = false;


  private subscriptions: Subscription[] = [];


  ngOnInit() {
  }

  projectForm = new FormGroup({
    name: new FormControl('', {validators: [Validators.required, Validators.minLength(3), Validators.maxLength(25)]}),
    summary: new FormControl('', {validators: [Validators.required, Validators.minLength(3), Validators.maxLength(80)]}),
  })


  public _createNewProject(): void {
//    this.loadingService.show();
    this.newProject.nameProject = this.projectForm.get('name').value;
    this.newProject.summary = this.projectForm.get('summary').value;
    if(!this.searchCreatedProject())
      this.subscriptions.push(this.projectService.saveProject(this.newProject).subscribe(() => {
        this.newProject = new Project();
       // this.activeRef.hide();
      }));
    console.log(this.newProject);
   // this.loadingService.hide();
  }

  public searchCreatedProject():boolean{
    this.isNewProject = false;
    this.allProject.forEach((u: Project)=> {
        if (this.newProject.nameProject === u.nameProject)
          this.isNewProject = true;
      }
    )
    return this.isNewProject;
  }
}
