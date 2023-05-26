package com.github.nogueiralegacy.ordenacao;

public class Utils {
    public Integer[] geraVetorAleatorio(int tamanho) {
        Integer[] vetor = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * tamanho);
        }

        return vetor;
    }

    public void mergeSortRecursivo(int[] vetor, int tamanho) {
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
        mergeSortRecursivo(esquerda, mid);
        mergeSortRecursivo(direita, tamanho - mid);

        mergeRecursivo(vetor, esquerda, direita, mid, tamanho - mid);
    }

    public void mergeRecursivo(int[] vetor, int[] esquerda, int[] direita, int esquerdaTamanho, int direitaTamanho) {

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
