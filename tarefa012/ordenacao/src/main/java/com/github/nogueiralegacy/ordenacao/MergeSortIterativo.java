package com.github.nogueiralegacy.ordenacao;

public class MergeSortIterativo implements Ordena{

    public String getNome() {
        return "MergeSortIterativo";
    }
    public void ordena(int[] vetor) {
        int tamanho = vetor.length;
        int[] auxArray = new int[tamanho];

        for (int indice = 1; indice < tamanho; indice *= 2) {
            for (int indiceEsquerda = 0; indiceEsquerda < tamanho - indice; indiceEsquerda += 2 * indice) {
                int mid = indiceEsquerda + indice - 1;
                int finalDireita = Math.min(indiceEsquerda + 2 * indice - 1, tamanho - 1);
                mergeIterativo(vetor, auxArray, indiceEsquerda, mid, finalDireita);
            }
        }
    }

    public static void mergeIterativo(int[] array, int[] auxArray, int comecoEsquerda, int mid, int finalDireita) {
        int finalEsquerda = mid;
        int comecoDireita = mid + 1;

        int esquerda = comecoEsquerda;
        int direita = comecoDireita;
        int indice = comecoEsquerda;

        while (esquerda <= finalEsquerda && direita <= finalDireita) {
            if (array[esquerda] <= array[direita]) {
                auxArray[indice++] = array[esquerda++];
            } else {
                auxArray[indice++] = array[direita++];
            }
        }

        while (esquerda <= finalEsquerda) {
            auxArray[indice++] = array[esquerda++];
        }

        while (direita <= finalDireita) {
            auxArray[indice++] = array[direita++];
        }

        for (int i = comecoEsquerda; i <= finalDireita; i++) {
            array[i] = auxArray[i];
        }
    }
}
