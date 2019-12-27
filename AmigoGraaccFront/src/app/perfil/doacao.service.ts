import { Doacao } from './doacao.model';
import { map, tap } from 'rxjs/operators';
import { GRAACC_API } from './../app.api';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DoacaoService {
  
  constructor(private http: HttpClient) { }

  realizarDoacao(doacao: Doacao): Observable<Doacao[]> {
    return this.http.post(`${GRAACC_API}/pontuacao/insert`, doacao).pipe(tap(console.log))
  };

  listarCategorias(): Observable<any[]> {
    return this.http.get(`${GRAACC_API}/categorias`).pipe(tap(console.log));
  };

  getFacePerfil(idUsuario: any): Observable<any> {
    return this.http.get(`${GRAACC_API}/pontuacao/face/` + idUsuario).pipe(tap(console.log));
  };
}
