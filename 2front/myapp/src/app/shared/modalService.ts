import {Injectable, NgModule, TemplateRef} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {NgbActiveModal, NgbModal, NgbModalConfig} from "@ng-bootstrap/ng-bootstrap";
import {config} from "rxjs";
@Injectable()
export class ModalService{

  public modalRef: BsModalRef;
  closeResult: string;


  content:string;
  constructor( config: NgbModalConfig, private modalService: BsModalService ,private ngbModal:NgbModal){

  }





  public _openModal(template: TemplateRef<any>): void {
 this.modalRef = this.modalService.show(template);
  }
  public _close(): void {
  }

  openScrollableContent(longContent) {
    this.ngbModal.open(longContent, { scrollable: true });
  }

 // this.modalService.open(content, { size: 'lg' });

  openLgCentered(content) {
    this.ngbModal.open(content, { centered: true ,size: 'lg',backdrop : 'static',keyboard : false});
  }

  openVerticallyCentered(content) {
    this.ngbModal.open(content, { centered: true,backdrop:  'static',keyboard : false});
  }

close(){
 // this.ngbModal.dismissAll();
}


}
