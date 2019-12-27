import { DoacaoService } from './doacao.service';
import { FormsModule } from '@angular/forms';
import { NgSelectOption } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PerfilComponent } from './perfil.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { PerfilRoutingModule } from './perfil-routing.module';
import {NgSelectModule} from '@ng-select/ng-select';
import { NgxCurrencyModule } from "ngx-currency";
import { ShareButtonsModule } from '@ngx-share/buttons';
import { UsuarioService } from '../usuario/usuario.service';



@NgModule({
  declarations: [PerfilComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    PerfilRoutingModule,
    NgbModule,
    FormsModule,
    NgSelectModule,
    NgxCurrencyModule,
    ShareButtonsModule
  ],
  providers: [DoacaoService, UsuarioService]
})
export class PerfilModule { }
