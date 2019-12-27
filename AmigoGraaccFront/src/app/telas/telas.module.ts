import { Tela1Component } from './tela1/tela1.component';
import { TelasRoutingModule } from './telas-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChartsModule } from 'ng2-charts';



@NgModule({
  declarations: [Tela1Component],
  imports: [
    CommonModule,
    TelasRoutingModule,
    ChartsModule
  ]
})
export class TelasModule { }
