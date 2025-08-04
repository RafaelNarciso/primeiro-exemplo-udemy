package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.service;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;
import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository.ProdutoRepository;
import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository.ProdutoRepository_old;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    //#region  aqui estou definindo a classe como um serviço
    @Autowired //aqui estou dizendo deixas que agora eu tomo contar
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        return produtoRepository.findAll();//para salvar
    }

    public Optional<Produto> obterPorId(long id) {
        return produtoRepository.findById(Math.toIntExact(id)); // aqui estou convertendo o long para int, pois o id do produto
    }

    public Produto adicionar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(long id) {
        produtoRepository.deleteById(Math.toIntExact(id)); // aqui estou convertendo o long para int, pois o id do produto é do
    }

    public Produto atualizar(long id,Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }


    //#endregion
}
