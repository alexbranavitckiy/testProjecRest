import {Component, Input, OnInit} from '@angular/core';
import {ModalService} from "../../../shared/modalService";

@Component({
  selector: 'app-add-executer',
  templateUrl: './add-executer.component.html',
  styleUrls: ['./add-executer.component.css']
})
export class AddExecuterComponent implements OnInit {


  @Input() title: string;


  constructor(private  modalServ: ModalService) {
  }

  ngOnInit() {
  }

}
