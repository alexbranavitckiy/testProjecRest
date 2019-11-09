import {Component, Injectable} from "@angular/core";
import {providerDef} from "@angular/compiler/src/view_compiler/provider_compiler";
import {HttpClient} from "@angular/common/http";
import {Observable, pipe} from "rxjs";
import {tap} from "rxjs/operators";
import {Router} from "@angular/router";
import {Project} from "../model/project";
// ангулар , тайпскрипт тест только
//Для отображения данных на странице, сначала
// нужно эти данные
// откуда-то взять. Для этого и нужны сервисы


export interface  Paths{
  Role: number;//1-manager
 nameRout :string;
  nameForm:string;
}
export interface DataBase {
  id: number
  title :string
  taski2 :string
  taski :string
  developer :string
  developer2 :string
  progress: number
}


@Injectable({providedIn:'root'})
export  class Service {
  private idnabber:number;
public  getIdiser(){
  return  this.idnabber;
}
  public setIdiser(number:number){
    this.idnabber=number;
  }

  goComponent(str:string){
    this.router.navigate([str]);
  }


  public paths: Paths[]=[
    {Role:1,nameRout:'Home/ListProject',nameForm:'List Project'},
    {Role:1,nameRout:'Home/NewTasks',nameForm:'New Tasks'},
    {Role:1,nameRout:'Home/NewProject',nameForm:'New Project'},
    {Role:2,nameRout:'Home/NewUser',nameForm:"New User"},
    {Role:2,nameRout:'Home/ListProject',nameForm:"List Project"},
    {Role:3,nameRout:'Home/ListProject',nameForm:"My tasks"},
    {Role:3,nameRout:'Home/ProjectView',nameForm:"My office"},
    {Role:3,nameRout:'Home/ListProject',nameForm:"Settings"},
    {Role:4,nameRout:'Home/',nameForm:"Work Developer"},
    {Role:4,nameRout:'Home/',nameForm:"My office"},
    {Role:4,nameRout:'Home/',nameForm:" Settings"},
    ];


  public dataBase: DataBase[]=[];

  constructor(private http: HttpClient,private router: Router){}



  // Ajax request for billing account data
  getBillingAccounts(): Observable<Project[]> {
    return this.http.get<Project[]>('/api/ba');
  }

  saveBillingAccount(billingAccount: Project): Observable<Project> {
    return this.http.post<Project>('/api/ba', billingAccount);
  }

  deleteBillingAccount(billingAccountId: string): Observable<void> {
    return this.http.delete<void>('/api/ba/' + billingAccountId);
  }












  fethDataBase():Observable<DataBase[]> {
    return   this.http.get<DataBase[]>('https://jsonplaceholder.typicode.com/todos')
      .pipe(tap(dataBase=>this.dataBase=dataBase))
  }



  onToggle(id: number){
    const  ind=this.dataBase.findIndex(t=>t.id===id)
    console.log(ind)
  }
}
