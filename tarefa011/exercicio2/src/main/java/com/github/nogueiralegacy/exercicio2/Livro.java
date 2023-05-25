package com.github.nogueiralegacy.exercicio2;

public class Livro extends Produto {
    private String autor;

    public Livro(String autor) {
        super("Livro de Informática");
        this.autor = autor;
    }

    public String getDescricao() {
        return super.getDescricao() + " " + this.autor;
    }
}
