package com.github.nogueiralegacy.ordenacao;

public class Teste {

    public void quadroDeTempo(int[] vetor, Ordena ordena) {
        long tempo = new Utils().calculaTempo(vetor, ordena);
        System.out.println("Tempo: " + (double) tempo / (1000 * 1000) + "ms - " + ordena.getNome());
    }
    public static void main(String[] args) {
        // Veto 100 elementos
        System.out.println("Vetor 100 elementos");
        int[] vetor = Utils.geraVetorAleatorio(100);

        int[] vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortIterativo());

        vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortRecursivo());

        // Vetor 1000 elementos
        System.out.println("Vetor 1000 elementos");
        vetor = Utils.geraVetorAleatorio(1000);

        vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortIterativo());

        vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortRecursivo());


        // Vetor 10000 elementos
        System.out.println("Vetor 10000 elementos");
        vetor = Utils.geraVetorAleatorio(10000);

        vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortIterativo());

        vetorCopia = vetor.clone();
        new Teste().quadroDeTempo(vetorCopia, new MergeSortRecursivo());
    }
}
