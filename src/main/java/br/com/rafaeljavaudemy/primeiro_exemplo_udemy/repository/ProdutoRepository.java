package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;

@Repository
public class ProdutoRepository {

    private List <Produto> produtos = new ArrayList<>();
    private Integer ultimoId = 0;
    
    /**
     * Retorna todos os produtos cadastrados 
     * @return
     */
    public List<Produto>  obterTodos() {
        return produtos;
    }
    public Optional <Produto> obterPorId(long id){
        return produtos.stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();

    } 



}
