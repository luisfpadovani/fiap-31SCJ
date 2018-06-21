import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms'

import { HttpModule } from '@angular/http'; 

import { appRoutes } from './rotas/app.routes'; //deve vir primeiro

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { SubLista } from './filters/sublista.filter';

//usado nas rotas
import { HomeComponent } from './home/home.component';
import { CadastroComponent } from './cadastro/cadastro.component';
import { NotFoundComponent } from './erro/notFound.component';
import { EventosService } from './services/eventos.service';


@NgModule({
  //lista os modulos que a aplicação necessitara
  imports: [BrowserModule, RouterModule.forRoot(appRoutes), FormsModule, HttpModule],
  //lista os componentes que nossa aplicação utilizará
  declarations: [AppComponent,  MenuComponent,  HomeComponent,  CadastroComponent, NotFoundComponent, SubLista],
  //este é o componente inicial, incluído no index.html
  bootstrap: [ AppComponent ],
  //provider usado para Serviços do tipo evento
  providers : [ EventosService ]
  })
  export class AppModule { }