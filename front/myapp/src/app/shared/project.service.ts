import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Project} from "../model/project";
import {tap} from "rxjs/operators";
import {DataBase} from "./service";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient,private router: Router) { }




 // getAllProject():Observable<Project[]>{

   // return this.http.get<Project[]>('');


  //}


}
