import {Role} from "./role";
import {Parol} from "./parol";
import {Status} from "./status";

export class User {

  idUsers: number;
  FerstSecondName: string;
  role: Role;
  parol:Parol;



  constructor(){
    this.role = new Role();
    this.parol = new Parol();
  }

}
