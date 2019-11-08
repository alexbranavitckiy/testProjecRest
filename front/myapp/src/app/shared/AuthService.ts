import {Injectable} from "@angular/core";
import {of} from "rxjs";
import {Service} from "./service";
import {ModalService} from "./modalService";



@Injectable()
export class AuthService {

  private isloggedIn: boolean;
  private userName:string;

  constructor(private service:Service,private  modalServ:ModalService ) {
    this.isloggedIn=false;
  }

  login(username: string, password:string) {
    //Assuming users are provided the correct credentials.
    //In real app you will query the database to verify.

    switch(username) {
      case "Manager": {
        this.modalServ.modalRef.hide()
      this.service.setIdiser(1);
        this.isloggedIn=true;
        this.userName=username;
        return this.isloggedIn;
        break;

      }
      case "Admin": {
        this.modalServ.modalRef.hide()
        this.isloggedIn=true;
        this.userName=username;
        this.service.setIdiser(2);
        return this.isloggedIn;
        break;

      }
      case "Tester": {
        this.isloggedIn=true;

        this.modalServ.modalRef.hide()
        this.service.setIdiser(3);
        return this.isloggedIn;
        break;
      }
      case "Developer": {
        this.modalServ.modalRef.hide()
        this.isloggedIn=true;
        this.service.setIdiser(4);
        return this.isloggedIn;
        break;
      }
      default: {
        this.isloggedIn=false;
        return this.isloggedIn;
        break;
      }
    }

  }

  isUserLoggedIn(): boolean {
    return this.isloggedIn;
  }



}

