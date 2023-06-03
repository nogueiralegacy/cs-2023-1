package com.github.nogueiralegacy.erro;

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

    public void exibir() throws ProdutoInvalidoException {
        for (Produto produto : carrinho) {
            if (produto instanceof Livro || produto instanceof Mouse) {
                System.out.println(produto.getDescricao());
            }
            else {
                throw new ProdutoInvalidoException
                        (produto.getDescricao() + " - Produto invalido!");
            }
        }
    }

    public static void main(String[] args) {
        ProdutoTeste teste = new ProdutoTeste();
        try {
            teste.exibir();
        } catch (ProdutoInvalidoException exception) {
            System.out.println(exception.getMessage());
        }
    }
}