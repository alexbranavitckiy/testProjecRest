import {Project} from "./project";
import {User} from "./user";
import {Status} from "./status";
import {Priority} from "./Priority";

export class Task {















  id: number;
  description: string;
  dueData: Date;
  estimation:number;
  assigne: string;
  codtask: string;
  createDate: Date;
  updateDate: Date;
  closedDate: Date;
  reporter: User;
  priority: Priority;
  project: Project;
  comments: string;
  stories: string;
  attachment:string;
  status: Status;

  constructor(){

    this.status = new Status();
    this.reporter = new User();
    this.project = new Project();
    this.priority = new Priority();


  }
}



