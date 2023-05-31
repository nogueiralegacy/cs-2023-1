package com.github.nogueiralegacy.exercicio2;

import java.util.ArrayList;

public class ProdutoTeste {
    ArrayList <Produto> carrinho = new ArrayList<>();

    ProdutoTeste() {
        carrinho.add(new Livro("Machado de Assis"));
        carrinho.add(new Livro("Guimaraes Rosa"));
        carrinho.add(new Livro("Jorge Amado"));
        carrinho.add(new Mouse("Gamer"));
        carrinho.add(new Mouse("Pesado"));
        carrinho.add(new Mouse("Leve"));
    }

    public void exibir() {
        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }

    public static void main(String[] args) {
        ProdutoTeste teste = new ProdutoTeste();
        teste.exibir();
    }
}