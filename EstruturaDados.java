/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaJava;

import static AulaJava.QuickSort.quickSort;
import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class TrabalhoEstrutura {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitura = new Scanner(System.in);
        int[] lista = new int[20];
        int opcao;
        int opcao2;
        do {
            System.out.println(" ");
            System.out.println("***Estrutura de Dados***");
            System.out.println("***1 - Digitar 20 valores***");
            System.out.println("***2 - Gerar 20 valores aleatorios ***");
            System.out.println("***3 - Ordenar ***");
            System.out.println("***4 - Sair ***");
            System.out.println("Digite a opção desejada: ");
            opcao = Integer.parseInt(leitura.nextLine());

            //Digitar 20 valores
            if (opcao == 1) {
                for (int i = 0; i < lista.length; i++) {

                    System.out.println("Digite um numero : [" + i + "]");

                    lista[i] = Integer.parseInt(leitura.nextLine());

                }

                System.out.println("\nVocê digitou os Seguintes Numeros");
                for (int i = 0; i < lista.length; i++) {// Mostrando os valores no Array
                    System.out.print("| " + lista[i] + " |");
                }
            }

            //Recebe 20 valores aleatorios
            if (opcao == 2) {

                System.out.println("Os numeros aleatorios são: ");

                for (int j = 0; j < lista.length; j++) {

                    lista[j] = random.nextInt(1000);
                    System.out.print(" " + lista[j] + " ");

                }
            }

            if (opcao == 3) {

                do {

                    System.out.println(" ");
                    System.out.println("***Selecione qual metodo sort***");
                    System.out.println("***1 - BobbleSort ***");
                    System.out.println("***2 - InsertionSort ***");
                    System.out.println("***3 - SelectionSort ***");
                    System.out.println("***4 - MergeSort ***");
                    System.out.println("***5 - QuickSort ***");
                    System.out.println("***6 - sair ***");
                    System.out.println("Digite: ");
                    opcao2 = Integer.parseInt(leitura.nextLine());

                    if (opcao2 == 1) {

                        int aux;
                        System.out.println("Vetor Original");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.println("Posicao[" + i + "]= " + lista[i]);
                        }
                        System.out.println("");
                        System.out.print("Inicial - ");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }
                        System.out.println("");
                        for (int i = 0; i < lista.length; i++) {
                            for (int j = 0; j < lista.length - 1; j++) {

                                if (lista[j] > lista[j + 1]) {
                                    aux = lista[j];
                                    lista[j] = lista[j + 1];
                                    lista[j + 1] = aux;
                                }
                            }
                            // Mostra o vetor resultante da troca de posições
                            System.out.print("Passo " + (i + 1) + " - ");
                            for (int j = 0; j < lista.length; j++) {
                                System.out.print(lista[j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Vetor Ordenado");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.println("Posicao[" + i + "]= " + lista[i]);
                        }
                    }//termina bobblesort

                    if (opcao2 == 2) {

                        int menor, j, i;
                        System.out.println("Vetor Original");
                        for (i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }
                        System.out.println("");
                        // Inicio o algoritmo pela segunda posicao
                        for (i = 1; i < lista.length; i++) {
                            menor = lista[i];
                            j = i;
                            // Enquanto o valor da posicao for maior ele faz a troca pelo valor anterior
                            while ((j > 0) && (lista[j - 1] > menor)) {
                                lista[j] = lista[j - 1];
                                j -= 1;
                            }
                            // Faz a troca do valor menor
                            lista[j] = menor;
                            // Mostra o vetor resultante da troca de posições
                            System.out.print("Passo " + (i) + " - ");
                            for (j = 0; j < lista.length; j++) {
                                System.out.print(lista[j] + " ");
                            }
                            System.out.println();

                        }
                        System.out.println("");
                        System.out.println("Vetor Ordenado");
                        for (i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }
                    }//termina InsertionSort

                    if (opcao == 3) {
                        int i, j, indice, menor;
                        System.out.println("Vetor Original");
                        for (i = 0; i < lista.length; i++) {
                            System.out.println("posicao[" + i + "] = " + lista[i]);
                        }
                        System.out.println(" ");
                        System.out.print("Inicial - ");
                        for (i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }
                        System.out.println("");

                        for (i = 0; i < lista.length - 1; i++) {
                            menor = lista[i];
                            indice = i;
                            for (j = i + 1; j < lista.length; j++) {
                                if (lista[j] < menor) {
                                    menor = lista[j];
                                    indice = j;
                                }
                            }
                            menor = lista[indice];
                            lista[indice] = lista[i];
                            lista[i] = menor;
                            // Mostra o vetor resultante da troca de posições
                            System.out.print("Passo " + (i + 1) + " - ");
                            for (j = 0; j < lista.length; j++) {
                                System.out.print(lista[j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Vetor Ordenado");
                        for (i = 0; i < lista.length; i++) {
                            System.out.println("posicao[" + i + "] = " + lista[i]);
                        }

                    }

                    if (opcao == 4) {

                        System.out.println("Vetor Original");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }
                        MergeSort mms = new MergeSort();
                        mms.sort(lista);
                        System.out.println("\n\nVetor Ordenado");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");

                        }

                    }

                    if (opcao == 5) {

                        System.out.println("Vetor Original");
                        for (int i : lista) {
                            System.out.print(i + " ");
                        }
                        quickSort(lista, 0, lista.length - 1);
                        System.out.println("\n\nVetor Ordenado");
                        for (int i = 0; i < lista.length; i++) {
                            System.out.print(lista[i] + " ");
                        }

                    }

                } while (opcao2 != 6);

            }

        } while (opcao != 4);

    }

}
