package com.github.nogueiralegacy.ordenacao;

public class MergeSortRecursivo implements Ordena {
    public String getNome() {
        return "MergeSortRecursivo";
    }
    public void ordena(int[] vetor) {
        int tamanho = vetor.length;
        if (tamanho < 2) {
            return;
        }
        int mid = tamanho / 2;
        int[] esquerda = new int[mid];
        int[] direita = new int[tamanho - mid];

        for (int i = 0; i < mid; i++) {
            esquerda[i] = vetor[i];
        }
        for (int i = mid; i < tamanho; i++) {
            direita[i - mid] = vetor[i];
        }
        ordena(esquerda);
        ordena(direita);

        mergeRecursivo(vetor, esquerda, direita, mid, tamanho - mid);
    }

    public static void mergeRecursivo(int[] vetor, int[] esquerda, int[] direita, int esquerdaTamanho, int direitaTamanho) {

        int i = 0, j = 0, k = 0;
        while (i < esquerdaTamanho && j < direitaTamanho) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            }
            else {
                vetor[k++] = direita[j++];
            }
        }
        while (i < esquerdaTamanho) {
            vetor[k++] = esquerda[i++];
        }
        while (j < direitaTamanho) {
            vetor[k++] = direita[j++];
        }
    }
}
