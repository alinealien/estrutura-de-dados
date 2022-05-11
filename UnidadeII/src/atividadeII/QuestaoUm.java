package atividadeII;

/*1. Considere um array de 10 elementos do tipo inteiro. Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array. OK
●  Implementação da busca sequencial:
○ Crie um método em Java que realiza uma busca sequencial. OK
■ Entrada do método: valor de busca e/ou array. OK
■ Saída do método: se o valor de busca estiver no array, retorne a posição do elemento. Caso contrário, retornará -1. OK
■ O método deve contar quantas comparações foram feitas. //FALTA NÃO ENTENDI
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
● Implementação da busca binária:
○ Crie um método em Java que realiza uma busca binária.
■ Entrada do método: valor de busca e/ou array.
■ Saída do método: se o valor de busca estiver no array, retorne a posição
do elemento. Caso contrário, retornará -1.

 */


import java.util.Arrays;
import java.util.Scanner;

public class QuestaoUm {

    public static void main(String[] args) {

        //BUSCA BINARIA

        //Ordenação do vetor/array
        //inicio = -90 indice = 0 | meio = 43 indice = 4 | fim = 212 indice = 9
        int[] elementos = {-90, -16, 4, 10, 43, 67, 75, 81, 137, 212};

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

        //BUSCA BINARIA - FAZENDO -


       /* Scanner bin = new Scanner(System.in);

        int[] elementos = {4, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        //os elementos do array podem ser definidos assim? como objeto?
        System.out.println(Arrays.toString(elementos));

        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = bin.nextInt();

            QuestaoUm.BuscaBinaria(num, elementos);

            if (QuestaoUm.BuscaBinaria(num, elementos)) {
                System.out.println(" *** O numero foi achado no metodo binario *** ");
            }else
                System.out.println(" *** O numero nao foi achado no metodo binario *** ");
        }

    public static boolean BuscaBinaria(int x, int elementos[]) {

        //Posição inicial do vetor.
        int inicio = 0;
        //Posição do meio do vetor.
        int meio;
        //Posição final do vetor.
        int fim = elementos.length -1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (x == elementos[meio])
                return true;
            if (x < elementos[meio])
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return false;

    }

}


       //BUSCA SEQUENCIAL


       /* Scanner leitor = new Scanner(System.in);



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
            }
            }
             if (i == elementos.length) {
                System.out.println("Número não encontrado!");
            }

        }
  */

