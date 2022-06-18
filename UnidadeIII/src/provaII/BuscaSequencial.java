package provaII;

/*
1. (2,5) Como funciona a busca sequencial? Elabore um exemplo de execução que mostre o passo
a passo da busca sequencial para um elemento que está no array e para um elemento que não
está no array.
 */

//BUSCA SEQUENCIAL
/*

A busca sequencial se caracteriza por percorrermos todos os elementos
de uma estrutura em busca do elemento “X” desejado.

 */


import java.util.Arrays;
import java.util.Scanner;


public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(elementos));

        System.out.println("Digite um numero para pesquisa:");
        int numero = scan.nextInt();

        //Temos um laço onde fará a verificação de todos os elementos [i] do array.
        //Dentro do laço temos uma condição para verificar SE o elemento/numero informado esta no vetor
        int i;
        for (i = 0; i <= elementos.length; i++) {

            if (elementos[i] != numero) {
                System.out.println("O número " + numero + " esta no array: ");
                break;
            //o else não funciona aqui, não sei pq
            }
        }


}
}