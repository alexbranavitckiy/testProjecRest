import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getAllUser():Observable<User[]>{
    console.log(this.http.get<User[]>('api/user/all'))
    return this.http.get<User[]>('api/user/all');
  }

  getUserById(id: string):Observable<User>{
    return this.http.get<User>('api/user/'+id);
  }

  saveUser(user: User):Observable<User>{
    return this.http.post<User>('api/user',user);
  }


}
