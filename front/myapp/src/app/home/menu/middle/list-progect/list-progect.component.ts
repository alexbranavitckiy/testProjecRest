import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-progect',
  templateUrl: './list-progect.component.html',
  styleUrls: ['./list-progect.component.css']
})
export class ListProgectComponent implements OnInit {




  constructor(private router: Router,private Service :Service) { }

  ngOnInit() {

    this.Service.fethDataBase().subscribe(()=>{

    })
  }
  oncChange(id :number){
    //  this.onToggle.emit(id)
    this.Service.onToggle(id)
  }
  goComponent(str:string){
    this.router.navigate([str]);
  }

}
