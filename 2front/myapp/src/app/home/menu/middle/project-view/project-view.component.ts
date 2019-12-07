import {Component, OnDestroy, OnInit} from '@angular/core';
import {ModalService} from "../../../../shared/modalService";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";
import {Subscription} from "rxjs";
import {ActivatedRoute, Router} from "@angular/router";
import {ProjectService} from "../../../../shared/project.service";

@Component({
  selector: 'app-project-view',
  templateUrl: './project-view.component.html',
  styleUrls: ['./project-view.component.css']
})
export class ProjectViewComponent implements OnInit, OnDestroy {


  private id: number;
  private product: string;
  private price: string;
  private routeSubscription: Subscription;
  allProject: Project[] = [];

  public projects: Project[];
  private subscriptions: Subscription[] = [];

  constructor(private  projectService: ProjectService, private route: ActivatedRoute, private  modalServ: ModalService, private service: Service) {
    this.routeSubscription = route.params.subscribe(params => this.id = params['id']);
  }

  ngOnInit() {
    this.projectService.getById(this.id).subscribe((data: Project) => {
      ((p: Project) => this.allProject.push(p));
    });
    console.log(this.allProject)
  }

  ngOnDestroy() {
    this.routeSubscription.unsubscribe();
  }

  public loadBillingAccounts(): void {
    // Get data from BillingAccountService
    //   this.subscriptions.push(this.service.getBillingAccounts().subscribe(accounts => {
    // Parse json response into local array
    //   this.projects = accounts as Project[];
    // Check data in console
    //  console.log(this.projects);// don't use console.log in angular :)
    // }));
  }


}
