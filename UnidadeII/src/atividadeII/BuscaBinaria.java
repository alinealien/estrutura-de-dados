package atividadeII;

import java.util.Arrays;
import java.util.Scanner;

/*
Nesta classe de algoritmo de busca, a estrutura de dados deve estar organizada
em determinada ordem a fim de que possamos dividir o algoritmo em duas partes,
daí o nome busca binária. Assim, usamos a numeração crescente de ordenação.
Na técnica dividir para conquistar, o algoritmo é dividido sempre em duas partes
para que possamos realizar as buscas na estrutura. A técnica consiste em comparar
o número a ser pesquisado com o valor que está no meio, sabendo se é maior ou menor,
e dividir o vetor em duas partes para trabalhar apenas a parte em que o número possa estar presente,
descartando a outra.
 */

/*
*1. Considere um array de 10 elementos do tipo inteiro:
Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Implementação da busca binária:
○ Crie um método em Java que realiza uma busca binária.
■ Entrada do método: valor de busca e/ou array.
■ Saída do método: se o valor de busca estiver no array, retorne a posição
do elemento. Caso contrário, retornará -1.
 */


public class BuscaBinaria {
    public static void main(String[] args) {
        //BUSCA BINARIA

        //Ordenação do vetor/array
        //inicio = -90 indice = 0 | meio = 43 indice = 4 | fim = 212 indice = 9
        int[] elementos = {-90, -16, 64, 10, 43, 67, 75, 81, 137, 212};

        //os elementos do array podem ser definidos assim? como objeto?
        System.out.println(Arrays.toString(elementos));

        Scanner bin = new Scanner(System.in);

        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = bin.nextInt();

        int resultado = binario(elementos, num);

        //VER UMA FORMA DE MELHORAR ISSO AQUI
        if(resultado != -1) {
            System.out.println(num + " encontrado na posição: " + resultado);

        }else if (resultado == -1){
                System.out.println( num + " Não encontrado / -1");
            }
        }

    private static int binario(int[] elementos, int num) {
        int inicio;
        int fim;
        int meio;
        inicio = 0;
        fim = elementos.length - 1;

        //Vai controlar o laço.
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