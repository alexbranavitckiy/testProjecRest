import {Project} from "./project";
import {User} from "./user";
import {Status} from "./status";
import {Priority} from "./Priority";

export class Task {
  id: number;
  description: string;
  due: Date;
  estimation: Date;
  assigne: number;
  codtas: string;
  createDate: Date;
  updateDate: Date;
  closedDate: Date;
  priority_task: number;
  project_task: number;
  comments: string;
  stories: string;
  attachment: string;
  status_task: number;

  constructor() {

  }
}



