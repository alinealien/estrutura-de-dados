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
        Scanner bin = new Scanner(System.in);

        //inicio = 4 indice = 0 | meio = 67 indice = 4 | fim = 75 indice = 9

        //Ordenação do vetor/array
        //inicio = -90 indice = 0 | meio = 43 indice = 4 | fim = 212 indice = 9
        int[] elementos = {-90, -16, 4, 10, 43, 67, 81, 75, 137, 212};

        //os elementos do array podem ser definidos assim? como objeto?
        System.out.println(Arrays.toString(elementos));

        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = bin.nextInt();


        int indice = binario(elementos, num);

    }

    private static int binario(int[] elementos, int x) {

        int inicio = 74;
        int meio;
        int fim = elementos.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elementos[meio] == x) {
                return meio;
            } else if (elementos[meio] < x) inicio = meio + 1;
            else if (elementos[meio] > x) fim = meio - 1;
        }
        return -1;
    }

}
