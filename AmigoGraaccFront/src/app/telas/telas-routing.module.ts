import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Tela1Component } from './tela1/tela1.component';

const routes: Routes = [
  { path: '', component: Tela1Component}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TelasRoutingModule {}
