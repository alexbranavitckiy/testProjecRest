import {Component, OnInit} from "@angular/core";
import {User} from "../../../../model/user";
import {Subscription} from "rxjs";
import {UserService} from "../../../../shared/user.service";
import {HttpClient} from "@angular/common/http";



@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {



  public test: string = " ";
  public newUser: User = new User();
  public allUsers: User[] = [];
  private subscriptions: Subscription[] = [];
  public isNewUser:boolean = false;

  constructor(public userService: UserService,

              public http: HttpClient,
           ) {
  }

  ngOnInit(): void {
    this.userService.getAllUser().subscribe((data: User[]) => {
      data.forEach((user: User) => this.allUsers.push(user));
    });
  }


  public _createNewUser(): void {
   // this.loadingService.show();
    this.subscriptions.push(this.userService.saveUser(this.newUser).subscribe(() => {
      this.newUser = new User();

      console.log("Task created");
     // this.activeRef.hide();
    }));
    console.log(this.newUser);
   // this.loadingService.hide();
  }

 // public searchCreatedUser():boolean{
  //    // this.isNewUser = false;
  //     //     this.allUsers.forEach((u:User)=> {
  //     //       // if (this.newUser.sign.login === u.sign.login)
  //     //       //  this.isNewUser = true;
  //     //     }    )
  //     return true//this.isNewUser;
  //   }
}
