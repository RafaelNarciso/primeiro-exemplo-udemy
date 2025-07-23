package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.InputMismatchException;

import org.springframework.stereotype.Repository;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;

@Repository
public class ProdutoRepository {
    //#region
    private List<Produto> produtos = new ArrayList<>();
    private Integer ultimoId = 0;
    //#endregion
    //#region
    /**
     * Retorna todos os produtos cadastrados.
     * 
     * @return Lista contendo todos os produtos cadastrados.
     */
    public List<Produto> obterTodos() {
        return produtos;
    }

    /**
     * Retorna o produto localizado pelo ID, se existir.
     * 
     * @param id ID do produto a ser localizado.
     * @return Optional contendo o produto localizado, ou vazio se não encontrado.
     */
    public Optional<Produto> obterPorId(long id) {
        return produtos.stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    /**
     * Adiciona um novo produto à lista de produtos.
     * 
     * @param produto Produto a ser adicionado.
     * @return O produto adicionado.
     */
    public Produto adicionar(Produto produto) {
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * Remove um produto da lista pelo ID.
     * 
     * @param id ID do produto a ser removido.
     */
    public void deletar(long id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Atualiza as informações de um produto na lista.
     * @param produto Produto com as novas informações a serem atualizadas.
     * @return O produto atualizado.
     * @throws InputMismatchException se o produto não for encontrado na lista.
     */
    public Produto atualizar(Produto produto) {
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());
        if (produtoEncontrado.isEmpty()) {
            throw new InputMismatchException("Produto não encontrado");
        }

        deletar(produto.getId());
        produtos.add(produto);
        return produto;
    }

    //#endregion
}
