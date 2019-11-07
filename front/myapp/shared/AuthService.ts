import {Injectable} from "@angular/core";
import {of} from "rxjs";
import {Service} from "./service";



@Injectable()
export class AuthService {

  private isloggedIn: boolean;
  private userName:string;

  constructor(private service:Service) {
    this.isloggedIn=false;
  }

  login(username: string, password:string) {
    //Assuming users are provided the correct credentials.
    //In real app you will query the database to verify.

    switch(username) {
      case "Manager": {

      this.service.setIdiser(1);
        this.isloggedIn=true;
        this.userName=username;
        return this.isloggedIn;
        break;

      }
      case "Admin": {

        this.isloggedIn=true;
        this.userName=username;
        this.service.setIdiser(2);
        return this.isloggedIn;
        break;

      }
      case "Tester": {
        this.isloggedIn=true;


        this.service.setIdiser(3);
        return this.isloggedIn;
        break;
      }
      case "Developer": {

        this.isloggedIn=true;
        this.service.setIdiser(4);
        return this.isloggedIn;
        break;
      }
      default: {

        return this.isloggedIn;
        break;
      }
    }

  }

  isUserLoggedIn(): boolean {
    return this.isloggedIn;
  }



}

  interface Interfac1e1 {


}


interface Interfac1e2 {


}

class Class1 {

}
class Class2 {

}
class Clas3 implements Interfac1e1,Interfac1e2{

}
