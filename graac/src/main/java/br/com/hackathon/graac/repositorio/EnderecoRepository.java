package br.com.hackathon.graac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hackathon.graac.entidade.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
