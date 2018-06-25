import { Injectable } from '@angular/core';
import { IContato } from '../Interface/contato.interface';

import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/Rx';

@Injectable()
export class ContatoService {

    //acesso ao HTTP
    public constructor(private _http: Http) { }
    private url: string = "http://localhost:3000/contatos";
 
    public getContatoWS(): Observable<IContato[]> { 
        return this._http.get(this.url)
            .map(res => res.json());
    }
  
    public setContatoWS(contato: IContato): Observable<IContato> {
        let header = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: header });
        let json = JSON.stringify(
            {
                id: contato.id,
                descricao: contato.nome,
                data: contato.telefone,
                dataNascimento: contato.dataNascimento 
            });
        return this._http.post(this.url, json, options)
            .map(res => res.json());
    }
}