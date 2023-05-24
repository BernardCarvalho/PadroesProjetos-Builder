package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class Produto {
    private long id;
    private int estoque=0;
    private String titulo, descricao, marca, modelo, urlFoto, categoria;
    private LocalDate dataCadastro, dataUltimaAtualizacao;
    private double peso, preco, altura, largura, profundidade;

    private Produto(){

    }
    public Produto(String titulo, String categoria, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.preco = preco;
    }

    public void setDataCadastro(LocalDate dataCadastro){
        if(dataCadastro.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("deve ser posterior a data de agora");
        this.dataCadastro = dataCadastro;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao){
        if(dataUltimaAtualizacao.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("deve ser posterior a data de agora");
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
    public void setModelo(String modelo){
        if(this.marca==null||this.marca.isEmpty())
            throw new IllegalStateException("deve setar a marca antes");
        this.modelo=modelo;
    }

    @Getter
    @Setter
    public class Builder{
        private long id;
        private int estoque=0;
        private String titulo, descricao, marca, modelo, urlFoto, categoria;
        private LocalDate dataCadastro, dataUltimaAtualizacao;
        private double peso, preco, altura, largura, profundidade;
        public Produto build(){
            Produto produto = new Produto();
            produto.setId(this.id);
            produto.setEstoque(this.estoque);
            produto.setTitulo(this.titulo);
            produto.setDescricao(this.descricao);
            produto.setMarca(this.marca);
            produto.setModelo(this.modelo);
            produto.setUrlFoto(this.urlFoto);
            produto.setCategoria(this.categoria);
            produto.setDataCadastro(this.dataCadastro);
            produto.setDataUltimaAtualizacao(this.dataUltimaAtualizacao);
            produto.setPreco(this.preco);
            produto.setPeso(this.peso);
            produto.setAltura(this.altura);
            produto.setProfundidade(this.profundidade);
            return produto;
        }
    }
}