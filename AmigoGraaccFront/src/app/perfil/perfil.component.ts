import { Doacao } from './doacao.model';
import { DoacaoService } from './doacao.service';
import { Component, OnInit } from '@angular/core';
import { NgbModalOptions, NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';
import { map } from 'rxjs/operators';
import { UsuarioService } from '../usuario/usuario.service';
import { Usuario } from '../usuario/usuario.model';


@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {
  
  title = 'ng-bootstrap-modal-demo';
  closeResult: string;
  modalOptions:NgbModalOptions;
  categoria = {id: '', nome:''};
  idUsuario = '1';
  imgPath = '';
  badges = [];
  badgesReverse = [];
  cpfUsuario = '12312312312';
  usuario: Usuario;

  public doa : Doacao;

  public doacao = {
    idUsuario: '',
    idCategoria: '',
    valorDoacao: 0,
    valorXP: 0
  };

  categorias = [];
 
  constructor( private modalService: NgbModal, public doacaoService: DoacaoService, public usuarioService: UsuarioService) { 
  }

   open(content, large) {
    
    if(large) {
      this.modalOptions = {
        backdrop:'static',
        backdropClass:'customBackdrop',
        size: 'lg'
      }
    } else {
      this.modalOptions = {
        backdrop:'static',
        backdropClass:'customBackdrop'
      }
    }
    
    this.modalService.open(content, this.modalOptions).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
      this.doacao.idUsuario='1';
      this.doacao.idCategoria=this.categoria.id;
      // this.doacao.valorDoacao = 100;
      this.doacao.valorXP=this.doacao.valorDoacao*3;
      this.realizarDoacao(this.doacao);
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
      console.log(this.closeResult);
    });
  }

  realizarDoacao(doacao: any){
    // this.doa = this.doacao;
    this.doacaoService.realizarDoacao(this.doacao).subscribe((response)=>{
      console.log(response);
      this.getFacePerfil();
      this.getBadges();
    })
  }
 
  getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
  }

  reciverFeedback(tipo, response) {
    console.log('Foi emitido o evento >>>> ', tipo, response);
  }

  getCategorias(content: any, large: boolean){
    this.doacaoService.listarCategorias().subscribe((response)=>{

      console.log(response);
      this.categorias = response;
      this.open(content, large);
    })
  }

  getFacePerfil() {
    this.doacaoService.getFacePerfil(this.idUsuario).subscribe((response)=>{
      console.log(response);
      this.imgPath = response.text;
    })
  }

  getBadges() {
    this.usuarioService.getUserBadges(this.idUsuario).subscribe((response)=>{
      console.log(response);
      this.badges = response;
      this.badges.reverse();
    })
  }

  getUsuario() {
    this.usuarioService.getUser(this.cpfUsuario).subscribe((response)=>{
      console.log(response);
      this.usuario = response;
    })
  }
  
  ngOnInit() { 
    this.getFacePerfil();
    this.getBadges();
    this.getUsuario();
  }

}
