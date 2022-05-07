package atividadeII;

/*1. Considere um array de 10 elementos do tipo inteiro. Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array. OK
●  Implementação da busca sequencial:
○ Crie um método em Java que realiza uma busca sequencial. OK
■ Entrada do método: valor de busca e/ou array. OK
■ Saída do método: se o valor de busca estiver no array, retorne a posição do elemento. Caso contrário, retornará -1. OK
■ O método deve contar quantas comparações foram feitas.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
● Implementação da busca binária:
○ Crie um método em Java que realiza uma busca binária.
■ Entrada do método: valor de busca e/ou array.
■ Saída do método: se o valor de busca estiver no array, retorne a posição
do elemento. Caso contrário, retornará -1.

 */


import java.util.Scanner;

public class QuestaoUm {

    public static void main (String[] args) {

        //BUSCA BINARIA

        //BUSCA SEQUENCIAL

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {4, 137, -16, 43, 67, 81, -90, 212, 10, 75}; //tentar colocar em uma linha só

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);

        }
        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = leitor.nextInt();


        //Um laço para fazer a verificação se o numero pesquisado esta ou não no vetor
        for(int i = 0; i < elementos.length;i++){
            if (elementos[i] == num) {
                System.out.println("Achei " + num + " na posição " + i);
                break;
            } else if (i == elementos.length - 1) {
                System.out.println("Número não encontrado!");
            }

        }


    }
}
