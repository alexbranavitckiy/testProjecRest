import {Injectable, NgModule, TemplateRef} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
@Injectable()
export class ModalService{
  public modalRef: BsModalRef;

  constructor(  private modalService: BsModalService ){ }


  public _closeModal(): void {
    this.modalRef.hide();
  }

  public flagOpenInsettings:boolean=false;

  public _openModal(template: TemplateRef<any>,flagOpenInsettings?:boolean): void {

 this.modalRef = this.modalService.show(template);
 this.flagOpenInsettings=flagOpenInsettings;
  }

}
