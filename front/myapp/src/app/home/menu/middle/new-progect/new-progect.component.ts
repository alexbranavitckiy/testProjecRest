import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-new-progect',
  templateUrl: './new-progect.component.html',
  styleUrls: ['./new-progect.component.css']
})
export class NewProgectComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }




  goComponent(str:string){
    this.router.navigate([str]);
  }




}
