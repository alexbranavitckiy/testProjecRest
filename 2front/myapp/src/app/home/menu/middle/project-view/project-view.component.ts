import { Component, OnInit } from '@angular/core';
import {ModalService} from "../../../../shared/modalService";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-project-view',
  templateUrl: './project-view.component.html',
  styleUrls: ['./project-view.component.css']
})
export class ProjectViewComponent implements OnInit {
  public projects: Project[];
  private subscriptions: Subscription[] = [];
  constructor(private  modalServ:ModalService, private service: Service) { }

  ngOnInit() {
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



}
