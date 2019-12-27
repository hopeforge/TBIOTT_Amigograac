import { map, tap } from 'rxjs/operators';
import { GRAACC_API } from './../app.api';
import { Usuario } from './usuario.model';
import { Badge } from './badge.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  
  constructor(private http: HttpClient) { }

  getAllUser(): Observable<Usuario[]> {
    return this.http.get(`${GRAACC_API}/usuarios/`).pipe(tap(console.log))
  };
  
  getUserBadges(id: string): Observable<Badge[]> {
    return this.http.get(`${GRAACC_API}/perfil/badges/`+id).pipe(tap(console.log))
  };

  getUser(cpf:string): Observable<Usuario> {
    return this.http.get(`${GRAACC_API}/usuarios/`+cpf).pipe(tap(console.log))
  };

}
