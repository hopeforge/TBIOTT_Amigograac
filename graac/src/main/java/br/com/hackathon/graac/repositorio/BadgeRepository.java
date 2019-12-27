package br.com.hackathon.graac.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hackathon.graac.entidade.Badge;
import br.com.hackathon.graac.entidade.Categoria;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long>{

	public List<Badge> findByXpMinLessThanEqualAndCategoria(Integer xp, Categoria categoria);
}
