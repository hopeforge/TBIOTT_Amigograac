import { Endereco } from './endereco.model';
export class Cadastro {
    nome: string;
    cpf: string;
    dataNascimento: string;
    email: string;
    telefone: any[];
    nomeDeUsuario: string;
    senha: string;
    confSenha: string;
    endereco: Endereco;
}