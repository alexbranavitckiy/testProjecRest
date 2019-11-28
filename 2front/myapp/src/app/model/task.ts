import {Project} from "./project";
import {User} from "./user";
import {Status} from "./status";
import {Priority} from "./Priority";

export class Task {
  idTask: number;
  project: Project;
  ticketCode: string;
  description: string;
  priority: string;
  status: string;
  createDate: string;
  dueData: Date;
  updateDate: string;
  resolvedDate: string;
  closedDate: string;
  estimation: number;
  assigne: string;
  reporter: string;
  comments: string;
  history: string;
  constructor(){}
}



