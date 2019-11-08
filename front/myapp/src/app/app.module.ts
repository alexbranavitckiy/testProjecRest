import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {NewTaskComponent} from "./home/menu/middle/new-task/new-task.component";
import {NewProgectComponent} from "./home/menu/middle/new-progect/new-progect.component";
import {ListProgectComponent} from "./home/menu/middle/list-progect/list-progect.component";
import {HeaderComponent} from "./home/header/header.component";
import {TopmenusComponent} from "./home/topmenus/topmenus.component";
import {SidebarComponent} from "./home/sidebar/sidebar.component";
import {FooterComponent} from "./home/footer/footer.component";
import {HomeComponent} from "./home/home.component";
import {ProjectViewComponent} from "./home/menu/middle/project-view/project-view.component";
import {NewUserComponent} from "./home/menu/middle/new-user/new-user.component";
import {WorkTaskComponent} from "./home/menu/middle/work-task/work-task.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule, Routes} from "@angular/router";
import {Service} from "./shared/service";
import {AuthService} from "./shared/AuthService";
import {AuthGuardService} from "./shared/AuthGuardService";
import {BsDropdownModule, BsModalService} from "ngx-bootstrap";
import { ModalModule } from 'ngx-bootstrap/modal';
import {ModalService} from "./shared/modalService";
import { TypeaheadModule } from 'ngx-bootstrap/typeahead';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {LoginComponent} from "./home/modal/login/login.component";
import { TaskWorkComponent } from './home/modal/task-work/task-work.component';


//canActivate : [AuthGuardService],

const appRoutes: Routes = [
  { path: '', redirectTo: 'Home',pathMatch :'full'},
  {path: 'Home', component:HomeComponent  ,children:[
      {path: 'ListProject', canActivate : [AuthGuardService],component: ListProgectComponent},
      {path: 'NewProject', canActivate : [AuthGuardService],component: NewProgectComponent},
      {path: 'NewTasks',canActivate : [AuthGuardService],component: NewTaskComponent},
      {path: 'ProjectView',canActivate : [AuthGuardService],component: ProjectViewComponent},
      {path: 'NewUser',canActivate : [AuthGuardService], component: NewUserComponent},
      {path: 'WorkTask',canActivate : [AuthGuardService], component: WorkTaskComponent},
      { path: 'Login',canActivate : [AuthGuardService],component : LoginComponent},
      { path: 'TaskWork',canActivate : [AuthGuardService],component : TaskWorkComponent}
    ]},
  { path: '**', redirectTo: 'Home',pathMatch :'full'}
];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,FooterComponent,
    HeaderComponent,
    ListProgectComponent,
    NewProgectComponent,
    NewTaskComponent,
    ProjectViewComponent,
    SidebarComponent,
    TopmenusComponent,
    NewUserComponent,TaskWorkComponent,
    LoginComponent,
    WorkTaskComponent,
    TaskWorkComponent,
  ],
  imports: [BrowserAnimationsModule,
    TypeaheadModule.forRoot(),
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    HttpClientModule,ModalModule.forRoot(),
    FormsModule, ReactiveFormsModule, ModalModule.forRoot(), TypeaheadModule.forRoot(), BrowserAnimationsModule
  ],
  providers: [AuthGuardService,AuthService,Service,ModalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
