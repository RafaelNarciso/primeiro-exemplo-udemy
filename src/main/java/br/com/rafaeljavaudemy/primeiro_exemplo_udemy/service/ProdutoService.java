package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.service;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;
import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    //#region  aqui estou definindo a classe como um serviço
    @Autowired //aqui estou dizendo deixas que agora eu tomo contar
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(long id) {
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto) {
        return produtoRepository.adicionar(produto);
    }

    public void deletar(long id) {
        produtoRepository.deletar(id);
    }

    public Produto atualizar(long id,Produto produto) {
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }


    //#endregion
}
