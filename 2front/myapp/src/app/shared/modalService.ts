import {Injectable, NgModule, TemplateRef} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
@Injectable()
export class ModalService{

  public modalRef: BsModalRef;
  closeResult: string;
  content:string;
  constructor(  private modalService: BsModalService ,private ngbModal:NgbModal){ }

  public _closeModal(): void {
    this.modalRef.hide();

  }


  public _openModal(template: TemplateRef<any>,flagOpenInsettings?:boolean): void {
 this.modalRef = this.modalService.show(template);
  }

  openVerticallyCentered(content) {
    this.ngbModal.open(content, { centered: true });
  }
  closrVerticallyCentered(content) {

    this.ngbModal.open(content).close(content);

  }
}
