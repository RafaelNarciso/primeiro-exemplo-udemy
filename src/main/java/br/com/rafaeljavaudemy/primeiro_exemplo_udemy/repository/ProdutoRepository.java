package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer > {

}
