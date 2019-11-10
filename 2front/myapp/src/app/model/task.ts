import {Project} from "./project";
import {User} from "./user";

export class Task {

  idTask: number;
  project: Project;
  nameUserWork: User;// кто  назначен

  ticketCode: string;
  createDate: string;
  dueData: Date;//срок сдачи

  updateDate: string;
  closedDateDeveloper: string;
  closedDateTester: string;
  comments: string;
  istorii: string;

  constructor(){
    this.project=new Project();
    this.nameUserWork=new User();


  }



}
