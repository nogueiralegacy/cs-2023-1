package com.github.nogueiralegacy.ordenacao;

public class Utils {
    public static int[] geraVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * tamanho);
        }

        return vetor;
    }

    public long calculaTempo(int[] vetor, Ordena ordena) {
        long tempoInicial = System.nanoTime();
        ordena.ordena(vetor);
        return System.nanoTime() - tempoInicial;
    }
}
