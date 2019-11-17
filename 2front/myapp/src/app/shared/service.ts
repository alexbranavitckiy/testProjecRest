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


export interface  PathsSideBar{
  Role: number;//1-manager
 nameRout :string;
  nameForm:string;
  booleanCheckOpenList ?:boolean;
}







export interface DataBase {// для левых данных
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
public flagUserList:boolean;
  private idnabber:number;// для защитника
  public  getIdiser(){// для защитника
  return  this.idnabber;
   }
  public setIdiser(number:number){// для защитника
    this.idnabber=number;
  }

  goComponent(str:string,flagUserList?:boolean):any {
    this.flagUserList=flagUserList;
    this.router.navigate([str]);
  }

//1 - менеджер 2- админ my settings
  public pathsSideBar: PathsSideBar[]=[
    {Role:1,nameRout:'Home/ListProject',nameForm:'List Project',booleanCheckOpenList:false},
    {Role:1,nameRout:'Home/NewTasks',nameForm:'New Tasks',booleanCheckOpenList:false},
    {Role:1,nameRout:'Home/NewProject',nameForm:'New Project',booleanCheckOpenList:false},
    {Role:2,nameRout:'Home/NewUser',nameForm:"New User ",booleanCheckOpenList:false},
    {Role:2,nameRout:'Home/ListProject',nameForm:"List Project",booleanCheckOpenList:false},
    {Role:2,nameRout:'Home/ListProject',nameForm:"List User",booleanCheckOpenList:true},
    {Role:3,nameRout:'Home/ListProject',nameForm:"My tasks",booleanCheckOpenList:false},
    {Role:4,nameRout:'Home/ListProject',nameForm:"My tasks",booleanCheckOpenList:false}
  ];




  public dataBase: DataBase[]=[];

  constructor(private http: HttpClient,private router: Router){}



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
