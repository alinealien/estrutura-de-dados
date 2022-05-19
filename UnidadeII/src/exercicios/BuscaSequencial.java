package exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1. Considere um array de 10 elementos do tipo inteiro. Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Implemente uma classe em Java que aloque e carregue esses elementos em um array. OK
●  Implementação da busca sequencial:
○ Crie um método em Java que realiza uma busca sequencial. OK
■ Entrada do método: valor de busca e/ou array. OK
■ Saída do método: se o valor de busca estiver no array, retorne a posição do elemento. Caso contrário, retornará -1. OK
■ O método deve contar quantas comparações foram feitas. //FALTA NÃO ENTENDI
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

 */

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Aqui ele mostra o vetor com 10 numeros aleatorios
        int[] v = gerarVetor(10);
        System.out.println(Arrays.toString(v) + " ");


        //Aqui ele vai receber um numero para pesquisar no vetor
        System.out.println("Digite um numero para pesquisa:");
        int num = leitor.nextInt();


        //Um laço para fazer a verificação se o numero pesquisado esta ou não no vetor
        int i;
        for (i = 0; i < v.length; i++) {
            if (v[i] == num) {
                System.out.println("Achei " + num + " na posição " + i);
                break;
            }

        }

        if (i == v.length) {
            System.out.println("Número não encontrado!");

        }
        //Bubble Sort - TESTE

        BuscaSequencial bs = new BuscaSequencial();
        bs.ordenar(v);
        for (int numero : v) {
            System.out.print(numero + " ");
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


   //Metodo para gerar os vetores aleatorios
    public static int[] gerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Random gerador = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100);
        }

        return vetor;
    }


}
