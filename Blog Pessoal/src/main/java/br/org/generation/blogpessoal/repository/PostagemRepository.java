package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{
/*/ gera uma herança da dependencia JPA com dois atributos,
o nome da classe model e o tipo do atributo da PK/*/
	public List<Postagem> findAllByTituloContainingIgnoreCase (String Titulo);
	// select * from tb_postagem where titulo like %titulo%
}
