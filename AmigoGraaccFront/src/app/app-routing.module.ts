import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path:'', loadChildren: () => import('./login/login.module').then(m => m.LoginModule)},
  {path:'home', loadChildren: () => import('./telas/telas.module').then(m => m.TelasModule)},
  {path:'usuario', loadChildren: () => import('./usuario/usuario.module').then(m => m.UsuarioModule)},
  {path:'cadastro', loadChildren: () => import('./cadastro/cadastro.module').then(m => m.CadastroModule)},
  {path:'perfil', loadChildren: () => import('./perfil/perfil.module').then(m => m.PerfilModule)},
  {path:'login', loadChildren: () => import('./login/login.module').then(m => m.LoginModule)},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
