package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.controller;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;
import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/produtos")//aqui estou definindo o caminho da minha API
public class ProdutoController {

    @Autowired //aqui estou dizendo, que o controller vai gerenciar
    private ProdutoService produtoService;

    @GetMapping // aqui estou dizendo que quando usar get produto ira charma service
    public List<Produto> obterTodos() {
        return produtoService.obterTodos();
    }
    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){//Aqui em @RequestBody estou dizendo que o produto vai vir no corpo da requisição
        return produtoService.adicionar(produto);
    }
    @GetMapping("/{id}") // aqui estou dizendo que quando usar get produto/id ira charma service
    public Optional<Produto> obterPorId(@PathVariable long id) {
        return produtoService.obterPorId(id);
    }

    @DeleteMapping("/{id}") // aqui estou dizendo que quando usar delete produto/id ira charma service
    public String deletar(@PathVariable long id) {
        produtoService.deletar(id);
        return "Produto de id : "+ id + ", deletado com sucesso!";
    }
    @PutMapping("/{id}")// aqui estou dizendo que quando usar put produto/id ira charma service
    public Produto atualizar(@RequestBody Produto produto, @PathVariable long id){//Aqui em @RequestBody estou dizendo que o produto vai vir no corpo da requisição
        return produtoService.atualizar(produto.getId(), produto);
    }

}
