/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3008;

/**
 *
 * @author 16100055
 */
public class MergeSort {

    private int[] array;
    private int[] arrayTemporario;
    private int tamanho;

    public static void main(String[] args) {
        int[] vetor = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        System.out.println("Vetor original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
        MergeSort mms = new MergeSort();
        mms.sort(vetor);
        System.out.println("\n\n Vetor Ordenado");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
    }

    //metodo de ordenação

    public void sort(int vetor[]) {
        this.array = vetor; //sera o vetor noa array da classe
        this.tamanho = vetor.length; //seta o tamanho do vetor a ser ordenado
        this.arrayTemporario = new int[tamanho]; //cria o array temporario
        executeMergeSort(0, tamanho - 1); //chama o meteodo para dividir

    }

    //divide o vetor em varios elementos
    private void executeMergeSort(int menorIndice, int maiorIndice) {
        if (menorIndice < maiorIndice) {
            //descobre media entre os 2 valores para ser o meio do vetor
            int meio = menorIndice + (maiorIndice - menorIndice) / 2;
            //ordena lado esquerdo do array
            executeMergeSort(menorIndice, meio);
            //Ordena o lado direito do vetor
            executeMergeSort(meio + 1, maiorIndice);
            //agora junta os 2 lados
            unaPartes(menorIndice, meio, maiorIndice);

        }

    }

    private void unaPartes(int menorIndice, int meio, int maiorIndice) {

        for (int i = menorIndice; i <= maiorIndice; i++) {
            arrayTemporario[i] = array[i];

        }

        int i = menorIndice;
        int j = meio + 1;
        int k = menorIndice;

        while (i <= meio && j <= maiorIndice) {
            if (arrayTemporario[i] <= arrayTemporario[j]) {
                array[k] = arrayTemporario[i];
                i++;
            } else {
                array[k] = arrayTemporario[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            array[k] = arrayTemporario[i];
            k++;
            i++;
        }
    }

}
