import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-topmenus',
  templateUrl: './topmenus.component.html',
  styleUrls: ['./topmenus.component.css']
})
export class TopmenusComponent implements OnInit {




  constructor(private router: Router) {
  }

  ngOnInit() {


  }

  goComponent(str: string) {
    this.router.navigate([str]);
  }
}
