package br.com.hackathon.graac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.graac.entidade.Usuario;
import br.com.hackathon.graac.excecao.ResourceNotFoundException;
import br.com.hackathon.graac.repositorio.UsuarioRepository;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	public Usuario findByCpf(String cpf) throws ResourceNotFoundException {
		Usuario usuario = usuarioRepository.findByDocIdentificacao(cpf);
		if(usuario == null) {
			throw new ResourceNotFoundException("Usuario com o CPF "+cpf+" não encontrado.");
		}
		return usuario;
	}

	public Usuario findById(long idUsuario) {
		return usuarioRepository.findById(idUsuario).get();
	}
	
}
