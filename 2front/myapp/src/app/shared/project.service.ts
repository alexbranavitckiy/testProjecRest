import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Project} from "../model/project";
import {tap} from "rxjs/operators";
import {DataBase} from "./service";
import {Router} from "@angular/router";
import {Task} from "../model/task";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient,private router: Router) { }



  saveProject(project: Project):Observable<Project>{
    console.log("работает saveProject")
    return this.http.post<Project>('api/project',project);
  }
  getById(id: number): Observable<Project> {
    return this.http.get<Project>('api/project/'+id);
  }



  getAllProject():Observable<Project[]>{
    console.log("работает getAllProject")
    return this.http.get<Project[]>('api/project/all');
  }


}
