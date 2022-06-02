package atividadeII;

import java.util.Arrays;
import java.util.Scanner;

/*
A busca sequencial se caracteriza por percorrermos todos os
elementos de uma estrutura em busca do elemento “X” desejado.
Seja uma estrutura de vetor A [a1, a2...an],
percorre mostodo o vetor fazendo as comparações de A[N] = X.
Caso a condição seja verdadeira, “X” existe na estrutura
e a busca será concluída com sucesso.

 */

/*

*1. Considere um array de 10 elementos do tipo inteiro:
Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array. OK
● Implementação da busca sequencial:
○ Crie um método em Java que realiza uma busca sequencial. OK
■ Entrada do método: valor de busca e/ou array. OK
■ Saída do método: se o valor de busca estiver no array, retorne a posição do elemento.
Caso contrário, retornará -1. OK
■ O método deve contar quantas comparações foram feitas. //FALTA NÃO ENTENDI


 */


public class BuscaSequencial {
    private static int i;

    //BUSCA SEQUENCIAL

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //64, 137, -16, 43, 67, 81, -90, 212, 10, 75
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        System.out.println(Arrays.toString(elementos));

        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = leitor.nextInt();


        //Um laço para fazer a verificação se o numero pesquisado esta ou não no vetor
        int i;
        for (i = 0; i < elementos.length; i++) {
            if (elementos[i] == num) {
                System.out.println("Achei " + num + " na posição " + i);

                break;
            }

        }
            //O método deve contar quantas comparações foram feitas.

            if (i == elementos.length) {
                System.out.println("Número " + num + " não encontrado!");
            }

        }
    }

