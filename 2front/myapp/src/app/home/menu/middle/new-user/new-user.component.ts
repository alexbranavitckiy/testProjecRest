import {Component, OnInit} from "@angular/core";
import {User} from "../../../../model/user";
import {Subscription} from "rxjs";
import {UserService} from "../../../../shared/user.service";
import {HttpClient} from "@angular/common/http";
import {FormControl, FormGroup, Validators} from "@angular/forms";



@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {

  private subscriptions: Subscription[] = [];
  public newUser: User = new User();
  public allUsers: User[] = [];


  constructor(public userService: UserService, public http: HttpClient) {
  }

  ngOnInit(): void {
    this.userService.getAllUser().subscribe((data: User[]) => {
      data.forEach((user: User) => this.allUsers.push(user));
    });
  }


  fomUser: FormGroup = new FormGroup(
    {
      "passwordOne": new FormControl("", Validators.required),
      "password": new FormControl("", Validators.required),
      "login": new FormControl("",Validators.required),
      "role": new FormControl("",Validators.required)
    })


  public createNewUser(): void {
    this.newUser.role=this.fomUser.get("role").value;
     this.newUser.login=this.fomUser.get("login").value;
     this.newUser.password=this.fomUser.get("password").value;
     console.log( this.fomUser )
     this.subscriptions.push(this.userService.saveUser(this.newUser).subscribe(() => {
      this.newUser = new User();
     })); console.log(this.newUser);
     }
}
