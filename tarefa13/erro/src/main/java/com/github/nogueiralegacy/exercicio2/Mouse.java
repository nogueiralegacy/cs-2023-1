package com.github.nogueiralegacy.exercicio2;

public class Mouse extends Produto {
    private String tipo;

    public Mouse(String tipo) {
        super("Mouse sem fio");
        this.tipo = tipo;
    }

    public String getDescricao() {
        return super.getDescricao() + " " + this.tipo;
    }
}
