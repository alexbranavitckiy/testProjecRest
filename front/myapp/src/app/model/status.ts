import {User} from "./user";
import {Task} from "./task";

export class Status {

  idStatus:number;

  idTask:Task;

  congestion:User;//загруженность

  constructor(){

this.idTask=new Task();
this.congestion=new User();

  }

}
