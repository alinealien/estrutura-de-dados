package atividadeII;

/*
2. Considere o mesmo array da questão 1. Desenvolva um programa em Java que receba
esse array com entrada, ordene seus elementos e imprima o resultado.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array.
● Crie um método para executar o algoritmo bubblesort:
○ Entrada do método: array desordenado.
○ Saída do método: array ordenado
 */

import java.util.Scanner;

public class QuestaoDois {

    //Bubble Sort - II
    public static void main(String[] args) {
        



    }


}


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
