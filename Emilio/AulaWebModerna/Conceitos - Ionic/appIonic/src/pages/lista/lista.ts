import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { RemoteServerProvider } from '../../providers/remote-server/remote-server';

@Component({
  selector: 'page-lista',
  templateUrl: 'lista.html',
})
export class ListaPage {

  listaContatos = [];

  constructor(private service: RemoteServerProvider) {
    this.getContatos();
  }
  
  getContatos(): void {
    this.service.getContatos()
      .subscribe(data => this.listaContatos = data);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ListaPage');
  }

}
