import { UsuarioService } from './usuario.service';
import { BrowserModule } from '@angular/platform-browser';
import { UsuarioRoutingModule } from './usuario-routing.module';
import { UsuarioComponent } from './usuario.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [UsuarioComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    UsuarioRoutingModule
  ],
  providers: [UsuarioService]
})
export class UsuarioModule { }
