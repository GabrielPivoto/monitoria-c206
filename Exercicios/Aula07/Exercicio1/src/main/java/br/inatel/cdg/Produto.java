package br.inatel.cdg;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return "\nProduto: " + this.nome + ", \nPreço: " + this.preco;
    }

}
