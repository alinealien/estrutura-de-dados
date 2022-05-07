package atividadeII;

/*1. Considere um array de 10 elementos do tipo inteiro. Os elementos são {64, 137, -16,
43, 67, 81, -90, 212, 10, 75}.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array.
● (3,5) Implementação da busca sequencial:
○ Crie um método em Java que realiza uma busca sequencial.
■ Entrada do método: valor de busca e/ou array.
■ Saída do método: se o valor de busca estiver no array, retorne a posição
do elemento. Caso contrário, retornará -1.
■ O método deve contar quantas comparações foram feitas.
● (3,5) Implementação da busca binária:
○ Crie um método em Java que realiza uma busca binária.
■ Entrada do método: valor de busca e/ou array.
■ Saída do método: se o valor de busca estiver no array, retorne a posição
do elemento. Caso contrário, retornará -1.

 */


public class QuestaoUm {

    public static void main (String[] args) {


        int[] elementos = {4, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);

        }

    }
}
