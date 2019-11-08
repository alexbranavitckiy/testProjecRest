import {AuthService} from "../../shared/AuthService";
import {Service} from "../../shared/service";
import {Router} from "@angular/router";
import {Component, OnInit} from "@angular/core";

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})

//*ngIf="authService.isloggedIn  " для тго чтобы добавить защитника + в модули и роутинг 
export class SidebarComponent implements OnInit {


  constructor(private router: Router, private service: Service, private authService: AuthService) {
  }

  ngOnInit() {
  }


  goComponent(str: string) {
    this.router.navigate([str]);
  }

}
