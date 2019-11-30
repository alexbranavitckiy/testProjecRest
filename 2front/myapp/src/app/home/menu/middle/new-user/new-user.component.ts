import {Component, OnInit} from "@angular/core";
import {User} from "../../../../model/user";
import {Subscription} from "rxjs";
import {UserService} from "../../../../shared/user.service";
import {HttpClient} from "@angular/common/http";
import {FormControl, FormGroup, FormGroupDirective, NgForm, Validators} from "@angular/forms";
import validate = WebAssembly.validate;



@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {


   password:string;
   topassword:string;

  private subscriptions: Subscription[] = [];
  public newUser: User = new User();
  public allUsers: User[] = [];

  pattern = "{{registerCredentials.password}}"

  constructor(public userService: UserService, public http: HttpClient) {
  }

  ngOnInit(): void {
    console.log(this.password+this.topassword)
    this.userService.getAllUser().subscribe((data: User[]) => {
      data.forEach((user: User) => this.allUsers.push(user));
    });
  }


  fomUser: FormGroup = new FormGroup(
    {
      "passwordOne": new FormControl("", Validators.required),
      "password": new FormControl("", [ Validators.required]),
      "login": new FormControl("", Validators.required),
      "role": new FormControl("", [Validators.required]),
      "role2": new FormControl("", [ Validators.required])
    })



  public createNewUser(): void {
    this.newUser.role = this.fomUser.get("role").value;
    this.newUser.login = this.fomUser.get("login").value;
    this.newUser.password = this.fomUser.get("password").value;
    console.log(this.fomUser)

    this.subscriptions.push(this.userService.saveUser(this.newUser).subscribe(() => {
      this.newUser = new User();
    }));
    console.log(this.newUser);
  }





    createNewUserValidator12(control: FormControl): {[s:string]:boolean}{
         if(this.fomUser.get("passwordOne").value!=this.fomUser.get("password").value){
          return {"password": false};
        }
        else {
        return {"password": true};} }





  }








