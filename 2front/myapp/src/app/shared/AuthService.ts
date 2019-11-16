import {Injectable} from "@angular/core";
import {of} from "rxjs";
import {Service} from "./service";
import {ModalService} from "./modalService";



@Injectable()
export class AuthService {

  private _isloggedIn: boolean;
  private userName:string;
nameLogin :string;
  constructor(private service:Service,private  modalServ:ModalService ) {
    this._isloggedIn=false;
    this.nameLogin="Вход";
  }

  clicks:number = 0;


  login(username: string, password:string):boolean {
    switch(username) {
      case "Manager": {
        this.nameLogin="Выход";
      this.service.setIdiser(1);
        this._isloggedIn=true;
        this.userName=username;
        return this._isloggedIn;
        break;
      }
      case "Admin": {
        this.nameLogin="Выход";
        this._isloggedIn=true;
        this.userName=username;
        this.service.setIdiser(2);
        return this._isloggedIn;
        break;
      }
      case "Tester": {
        this._isloggedIn=true;
        this.nameLogin="Выход";
        this.service.setIdiser(3);
        return this._isloggedIn;
        break;
      }
      case "Developer": {
        this.nameLogin="Выход";
        this._isloggedIn=true;
        this.service.setIdiser(4);
        return this._isloggedIn;
        break;
      }
      default: {
        this.nameLogin="Вход";
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

