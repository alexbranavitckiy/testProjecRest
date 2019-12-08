import {Project} from "./project";
import {User} from "./user";
import {Status} from "./status";
import {Priority} from "./Priority";

export class Task {
  id: number;
  code:string
  description: string;
  due: Date;
  estimation: number;
  assigne: number;
  createDate: Date;
  updateDate: Date;
  closedDate: Date;
  priority_task: number;
  project_task: number;
  stories: string;
  status_task: number;




  constructor() {

  }
}



