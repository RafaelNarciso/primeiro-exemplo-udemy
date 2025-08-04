package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.shared;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProdutoDTO {

        //#region Atributos
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long  id;

        private String nome;
        private Integer quantidade;
        private Double valor;
        private String observacao;
        //#endregion

        //#region Getters e Setters


        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Integer getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }
        public Double getValor() {
            return valor;
        }
        public void setValor(Double valor) {
            this.valor = valor;
        }
        public String getObservacao() {
            return observacao;
        }
        public void setObservacao(String observacao) {
            this.observacao = observacao;
        }
        //#endregion




}
