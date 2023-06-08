package com.github.nogueiralegacy.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscaContato(String identificador) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(identificador) || contato.getEmail().equals(identificador)) {
                return contato;
            }
        }

        return null;
    }

    public void excluiContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                break;
            }
        }
    }

    public void listaContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + " - Email: " + contato.getEmail());
        }
    }
}
