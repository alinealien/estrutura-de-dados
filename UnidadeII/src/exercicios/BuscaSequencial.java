package exercicios;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] v = gerarVetor(10);
        System.out.println(Arrays.toString(v));



        System.out.println("Digite um numero para pesquisa:");
        int num = leitor.nextInt();


       

                //if (num == v.length) {
                    //System.out.println("Achei!");
                }

            //}


    public static void imprimir(int v){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero para pesquisa:");
        int num = leitor.nextInt();

        while(num == v){
            System.out.println("Achei!");
        }

    }

    public static int[] gerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Random gerador = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100);
        }

        return vetor;
    }



}