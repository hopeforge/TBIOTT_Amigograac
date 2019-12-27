package br.com.hackathon.graac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.graac.entidade.Badge;
import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.repositorio.BadgeRepository;

@Service
public class BadgeServico {

	@Autowired
	private BadgeRepository badgeRepository;
	
	public List<Badge> findByXpMinLessThanEqualAndCategoria(Integer xp, Categoria categoria) {		
		return badgeRepository.findByXpMinLessThanEqualAndCategoria(xp, categoria);
	}
}
