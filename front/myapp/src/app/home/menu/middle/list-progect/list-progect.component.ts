import { Component, OnInit } from '@angular/core';
import {Service} from "../../../../shared/service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-progect',
  templateUrl: './list-progect.component.html',
  styleUrls: ['./list-progect.component.css']
})
export class ListProgectComponent implements OnInit {




  constructor(private router: Router,private service :Service) { }

  ngOnInit() {

    this.service.fethDataBase().subscribe(()=>{

    })
  }
  oncChange(id :number){
    //  this.onToggle.emit(id)
    this.service.onToggle(id)
  }
  goComponent(str:string){
    this.router.navigate([str]);
  }

}
