import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {Service} from "../../../../shared/service";
import {Project} from "../../../../model/project";

@Component({
  selector: 'app-new-progect',
  templateUrl: './new-progect.component.html',
  styleUrls: ['./new-progect.component.css']
})
export class NewProgectComponent implements OnInit {

  constructor(private router: Router,private service:Service) { }



  ngOnInit() {
  }

  showFile(input) {

}


}
