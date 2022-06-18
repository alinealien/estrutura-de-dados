package provaII;

/*
2. (2,5) Como funciona a busca binária? Elabore um exemplo de execução que mostre o passo a
passo da busca binária para um elemento que está no array e para um elemento que não está no
array.
 */

// BUSCA BINÁRIA
/*
Nesta classe de algoritmo de busca, a estrutura de dados deve estar organizada em determinada
ordem a fim de que possamos dividir o algoritmo em duas partes, daí o nome busca binária.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {

        //O vetor deve esta ordenado para que seja feita a busca
        int[] bb = {-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(bb));

        Scanner bin = new Scanner(System.in);

        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = bin.nextInt();

        int resultado = binario(bb, num);

        //Condicao para verificacao do numero informado e o numero no vetor
        if(resultado != -1) {
            System.out.println("Numero "+ num + " encontrado! ");

        }else if (resultado == -1){
            System.out.println("Numero" + " " + num + " não encontrado" );
        }
    }

    private static int binario(int[] elementos, int num) {
        int inicio;
        int fim;
        int meio;
        inicio = 0;
        fim = elementos.length - 1;

        //Vai controlar o laço da busca binaria
        //Aqui ele soma o inicio e o fim do array, depois dvide no meio para encontrar o elemento mais rapidamente
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elementos[meio] == num)
                return meio;

            else if (elementos[meio] < num) inicio = meio + 1;

            else if (elementos[meio] > num) fim = meio - 1;

        }


        return -1;
    }

}