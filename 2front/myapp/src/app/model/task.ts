import {Project} from "./project";
import {User} from "./user";
import {Status} from "./status";
import {Priority} from "./Priority";

export class Task {













//  private Date estimation;
//   private String assigne;
//   private String codtask;
//   private Date createDate;
//   private Date updateDate;
//   private Date closedDate;
//   private UserModel reporter;
//   private PriorityModel priority;
//   private ProjectModel project;
//   private String comments;
//   private String stories;
//   private String attachment;
//   private Integer status;









  id: number;
  description: string;
  dueData: Date;
  estimation:number;

  assigne: User;
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
    this.assigne = new User();
    this.reporter = new User();
    this.project = new Project();
    this.priority = new Priority();



  }
}



