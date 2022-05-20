package atividadeII;

/*
2. Considere o mesmo array da questão 1. Desenvolva um programa em Java que receba
esse array com entrada, ordene seus elementos e imprima o resultado.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array.
● Crie um método para executar o algoritmo bubblesort:
○ Entrada do método: array desordenado. OK
○ Saída do método: array ordenado OK
 */

import java.util.Arrays;
import java.util.Scanner;

//BubbleSort
public class QuestaoDois {

    public static void main(String[] args) {

        int elementos[] = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //Elementos Desosdenados
        System.out.println("ELEMENTOS DESORDENADOS");
        for(int i=0;i<elementos.length;i++)
        {
            System.out.print(elementos[i] + " | ");
        }

        System.out.println("\n____________________________________________________");
        System.out.println("ELEMENTOS ORDENADOS PELO BUBBLE SORT");


        QuestaoDois bubblesort = new QuestaoDois();
        bubblesort.ordenar(elementos);

         for (int numero : elementos) {
           System.out.print(numero + " | ");
        }

    }

     public void ordenar(int[] elementos) {

     //aqui o for é utilizado para controlar a quantidade de vezes que o vetor será ordenado.
    for(int i = 0; i < elementos.length - 1; i++) {

    // Variavel utilizada para controlar se o vetor ja está ordenado.
    boolean bubblesortOrdenado = true;

    // for utilizado para ordenar o vetor.
    for(int j = 0; j < elementos.length - 1 - i; j++) {

    // Se o valor da posição atual do vetor for maior que o proximo valor então troca os valores de lugar no vetor.
    if(elementos[j] > elementos[j + 1]) {
    int bbs = elementos[j];
    elementos[j] = elementos[j + 1];
    elementos[j + 1] = bbs;
    bubblesortOrdenado = false;
    }
    }
        // Se o vetor está ordenado então para as iterações sobre ele.
    if(bubblesortOrdenado)
    break;
    }
}
}

     // OUTRA FORMA DE FAZER UM BUBBLE SORT

    /*
    public static void main(String[] args) {


        //Buuble Sort I -

        Scanner leitor = new Scanner(System.in);

        int elementos[] = new int[10];

        //{64, 137, -16, 43, 67, 81, -90, 212, 10, 75}

        int i;
        System.out.println("Digite o 10 numeros para o array: ");
        for (i = 0; i < 10; i++) {
            int num = leitor.nextInt();

             elementos[i] = num;

        }

        QuestaoDois bs = new QuestaoDois();
        bs.ordenar(elementos);
        for (int numero : elementos) {
            System.out.println(numero + " ");
        }
    }
        public void ordenar(int[] elementos) {

        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < elementos.length - 1 - i; j++) {

                if (elementos[j] > elementos[j + 1]) {
                int aux = elementos[j];
                        elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;

                }

            }
        }
    }
}
     */
