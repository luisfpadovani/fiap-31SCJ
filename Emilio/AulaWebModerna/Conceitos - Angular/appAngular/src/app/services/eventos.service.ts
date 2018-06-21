import { Injectable } from '@angular/core';
import { IEvento } from '../interfaces/interface.evento';

import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/Rx';

@Injectable()
export class EventosService {

    //acesso ao HTTP
    public constructor(private _http: Http) { }
    private url: string = "http://localhost:3200/eventos";

    public getEventosWS(): Observable<IEvento[]> {
        console.log("EventosWS");
        return this._http.get(this.url)
            .map(res => res.json());
    }

    public getEventos(): IEvento[] { 
        return [
           
            { descricao: 'Congressodasdsa de TI', data: '16/01/2019', preco: 400 }
        ];
    }


  
    public setEventoWS(evento: IEvento): Observable<IEvento> {
        let header = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: header });
        let json = JSON.stringify(
            {
                descricao: evento.descricao,
                data: evento.data,
                preco: evento.preco
            });
        return this._http.post(this.url, json, options)
            .map(res => res.json());
    }
}