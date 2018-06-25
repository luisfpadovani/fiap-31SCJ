import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import {IContato} from '../../interface/contato.interface'
import { ContatoService } from '../../services/contato.services';

@Component({
  selector: 'page-contato',
  templateUrl: 'contato.html',
})
export class ContatoPage {

  public listaService: IContato[];
  constructor(public navCtrl: NavController, public navParams: NavParams, private contatoService: ContatoService) {
  }

  public listar(): void {
    this.contatoService.getContatoWS()
        .subscribe(res => this.listaService = res,
        error => alert(error),
        () => console.log('finalizado'));
}

  public incluir(contato: IContato) { 
    this.contatoService.setContatoWS(contato)
        .subscribe(res => JSON.stringify(res),
        error => alert(error),
        () => this.listar());
    alert('Evento incluído com sucesso');
}

  ionViewDidLoad() {
    console.log('ionViewDidLoad ContatoPage');
  }

}
