import {Component, Input, OnInit} from '@angular/core';
import {ModalService} from "../../../shared/modalService";
import {AuthService} from "../../../shared/AuthService";
import {Router} from "@angular/router";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent implements OnInit {
  @Input() history: string;

  constructor(private authService: AuthService,
              private router: Router, private  modalServ: ModalService, private ngbModal: NgbModal) {
  }

  ngOnInit() {
  }

}
