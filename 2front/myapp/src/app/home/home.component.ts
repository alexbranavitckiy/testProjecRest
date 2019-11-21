import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {AuthService} from "../shared/AuthService";
import {Component, OnDestroy, OnInit, TemplateRef, ViewChild} from "@angular/core";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {ModalService} from "../shared/modalService";
import {Service} from "../shared/service";
import {LoginComponent} from "./modal/login/login.component";
import {Subscription} from "rxjs";
import {Project} from "../model/project";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{





constructor(private  modalServ:ModalService,private authService: AuthService,private http: HttpClient,
  private router: Router,private service :Service) {
}

//  onFormSubmit(loginForm) :boolean{
//     return this.authService.login(loginForm.value.username, loginForm.value.password)
//   }

ngOnInit() {
  this.service.fethDataBase().subscribe(() => {
  })
 // this.loadBillingAccounts();
}

 // ngOnDestroy(): void {
  //     this.subscriptions.forEach(subscription => subscription.unsubscribe());
  //   }
    private subscriptions: Subscription[] = [];


//  public projects: Project[];
//   public loadBillingAccounts(): void {
//     // Get data from BillingAccountService
//     this.subscriptions.push(this.service.getBillingAccounts().subscribe(accounts => {
//       // Parse json response into local array
//       this.projects = accounts as Project[];
//       // Check data in console
//       console.log(this.projects);// don't use console.log in angular :)
//     }));
//   }










}
