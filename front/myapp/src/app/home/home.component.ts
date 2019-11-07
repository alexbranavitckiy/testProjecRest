import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {AuthService} from "../shared/AuthService";
import {Component, OnInit} from "@angular/core";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

username:string;

constructor(private authService: AuthService,private http: HttpClient,
  private router: Router) {
}


ngOnInit() {
}




  goComponent(str:string){
    this.router.navigate([str]);
  }




}
