import { Component, OnInit } from '@angular/core';
import { UsuarioService } from './usuario.service';
import { Usuario } from './usuario.model';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  constructor(public usuarioService: UsuarioService) { }
  
  usuarios: Usuario[] = [];

  ngOnInit() {
    this.usuarioService.getAllUser().subscribe(resp => {
      this.usuarios = resp;
    })
  }

  showUsers(){
    this.usuarioService.getAllUser().subscribe(resp => {
      this.usuarios = resp;
    })
  }

}
