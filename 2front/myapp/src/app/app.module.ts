import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {NewTaskComponent} from "./home/menu/middle/new-task/new-task.component";
import {NewProgectComponent} from "./home/menu/middle/new-progect/new-progect.component";
import {ListProgectComponent} from "./home/menu/middle/list-progect/list-progect.component";
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
import {SidebarsideComponent} from "./home/modal/sidebarside/sidebarside.component";
import {SidebarComponent} from "./home/sidebar/sidebar.component";
import { SidemenuComponent } from './home/menu/sidemenu/sidemenu.component';
import {NgbActiveModal, NgbModule} from "@ng-bootstrap/ng-bootstrap";
import { SettingsComponent } from './home/menu/middle/settings/settings.component';
import { AddExecuterComponent } from './home/modal/add-executer/add-executer.component';
import { HistoryComponent } from './home/modal/history/history.component';



//canActivate : [AuthGuardService],

const appRoutes: Routes = [
  { path: '', redirectTo: 'Home',pathMatch :'full'},
  {path: 'Home', component:HomeComponent  ,children:[
      {path: 'ListProject',component: ListProgectComponent},
      {path: 'NewProject', component: NewProgectComponent},
      {path: 'NewTasks',component: NewTaskComponent},
      {path: 'ProjectView',component: ProjectViewComponent},
      {path: 'NewUser', component: NewUserComponent},
      {path: 'WorkTask', component: WorkTaskComponent},
      { path: 'Login',component : LoginComponent},
      { path: 'TaskWork',component : TaskWorkComponent},
      { path: 'Settings',component : SettingsComponent}
    ]},
  { path: '**', redirectTo: 'Home',pathMatch :'full'}
];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

    ListProgectComponent,
    NewProgectComponent,
    NewTaskComponent,
    ProjectViewComponent,
    SidebarComponent,

    NewUserComponent,TaskWorkComponent,
    LoginComponent,
    WorkTaskComponent,
    TaskWorkComponent,
    SidebarsideComponent,
    SidemenuComponent,
    SettingsComponent,
    AddExecuterComponent,
    HistoryComponent,

  ],
  imports: [BrowserAnimationsModule, NgbModule,FormsModule,
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
