import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";
import {Router} from "@angular/router";
import {Project} from "../../../../model/project";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-list-progect',
  templateUrl: './list-progect.component.html',
  styleUrls: ['./list-progect.component.css']
})
export class ListProgectComponent implements OnInit {

  public projects: Project[];

  private subscriptions: Subscription[] = [];

  constructor(private router: Router,private service :Service) { }

  ngOnInit() {
   this.loadBillingAccounts()// загруска таблицы
 this.service.fethDataBase().subscribe(()=>{
   })
  }
  oncChange(id :number){
    //  this.onToggle.emit(id)
    this.service.onToggle(id)
  }

  goComponent(str:string){
    this.router.navigate([str]);
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(subscription => subscription.unsubscribe());
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
//


//


}
//use jira ;
// CREATE TABLE Project(
//   id bigint(20) NOT NULL AUTO_INCREMENT,
//   nameProject varchar(45) DEFAULT NULL,
//   username varchar(45) DEFAULT NULL,
//   customeremail varchar(45) DEFAULT NULL,
//    duadata varchar(45) DEFAULT NULL,
//     creatdata varchar(45) DEFAULT NULL,
//      istorii varchar(255) DEFAULT NULL,
//       comments varchar(255) DEFAULT NULL,
//   PRIMARY KEY (id)
// ) ENGINE=InnoDB AUTO_INCREMENT=1
