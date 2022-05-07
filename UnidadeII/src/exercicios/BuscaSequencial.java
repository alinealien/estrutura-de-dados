package exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Aqui ele mostra o vetor com 10 numeros aleatorios
        int[] v = gerarVetor(10);
        System.out.println(Arrays.toString(v));


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

        if (i == v.length - 1) {
            System.out.println("Número não encontrado!");
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
