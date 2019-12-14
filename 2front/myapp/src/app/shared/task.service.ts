import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Task} from "../model/task";
import {Status} from "../model/status";
import {Priority} from "../model/priority";
import {TaskConvector} from "../model/taskConvector";
import {Project} from "../model/project";


@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) {
  }

  getTask(): Observable<Task[]> {
    return this.http.get<Task[]>('api/task/all');
  }

  getById(id: string): Observable<Task> {
    return this.http.get<Task>('api/task/' + id);
  }



  getfindByIdInProjectConvert(id: number): Observable<TaskConvector[]> {

    console.log(id);
     return this.http.get<TaskConvector[]>('api/task/inProjectConvert/' + id);
   }

  getfindByIdInProjectObject(project: Project): Observable<TaskConvector[]> {
    return this.http.get<TaskConvector[]>('api/task/inProjectObject/' + project);
  }
  getfindByIdInProject(id: number): Observable<TaskConvector[]> {
    return this.http.get<TaskConvector[]>('api/task/inProject/' + id);
  }

  getdeleteTask(id: number): Observable<TaskConvector[]> {
    return this.http.get<TaskConvector[]>('api/task/deleteTask/' + id);
  }



  saveTask(task: TaskConvector): Observable<TaskConvector> {
    return this.http.post<TaskConvector>('api/task/saveTask', task);
  }

  updateTask(task: Task): Observable<Task> {
    return this.http.put<Task>('api/task/' + task.id, task);
  }

  getAllStatus(): Observable<Status[]> {return this.http.get<Status[]>('api/status/all');}

  getByIdStatus(id: string): Observable<Status> {
    return this.http.get<Status>('api/status/' + id);
  }



  getByIdPriority(id: string): Observable<Priority> {
    return this.http.get<Priority>('api/priority/' + id);
  }



  getAllPriority(): Observable<Priority[]> {return this.http.get<Priority[]>('api/priority/all');}


}
