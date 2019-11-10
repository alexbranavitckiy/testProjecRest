import {Injectable} from "@angular/core";
import {of} from "rxjs";
import {Service} from "./service";
import {ModalService} from "./modalService";



@Injectable()
export class AuthService {

  private _isloggedIn: boolean;
  private userName:string;

  constructor(private service:Service,private  modalServ:ModalService ) {
    this._isloggedIn=false;
  }
  login(username: string, password:string) {
    switch(username) {
      case "Manager": {
        this.modalServ.modalRef.hide()
      this.service.setIdiser(1);
        this._isloggedIn=true;
        this.userName=username;
        return this._isloggedIn;
        break;
      }
      case "Admin": {
        this.modalServ.modalRef.hide()
        this._isloggedIn=true;
        this.userName=username;
        this.service.setIdiser(2);
        return this._isloggedIn;
        break;

      }
      case "Tester": {
        this._isloggedIn=true;

        this.modalServ.modalRef.hide()
        this.service.setIdiser(3);
        return this._isloggedIn;
        break;
      }
      case "Developer": {
        this.modalServ.modalRef.hide()
        this._isloggedIn=true;
        this.service.setIdiser(4);
        return this._isloggedIn;
        break;
      }
      default: {
        this._isloggedIn=false;
        return this._isloggedIn;
        break;
      }
    }
  }


  getisloggedIn(): boolean {
    return this._isloggedIn;
  }
}

