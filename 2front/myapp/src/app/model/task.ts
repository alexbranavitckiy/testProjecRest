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
  history: string;
  constructor(){}
}



