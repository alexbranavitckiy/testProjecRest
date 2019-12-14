import {User} from "./user";
import {Priority} from "./priority";
import {Project} from "./project";
import {Status} from "./status";

export class TaskConvector {
  id: number;
  description: string;
  due: Date;
  estimation: number;
  assigne: User;
  code: string;
  createDate: Date;
  updateDate: Date;
  closedDate: Date;
  priority_task: Priority;
  project_task: Project;
  stories: string;
  status_task: Status;

  constructor() {
    this.status_task = new Status();
    this.assigne = new User();
    this.project_task = new Project();
    this.priority_task = new Priority();
  }
}


