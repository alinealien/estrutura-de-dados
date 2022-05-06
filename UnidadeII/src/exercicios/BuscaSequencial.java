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


    for(int i = 0; i < v.length;i++){
        if (v[i] == num) {
            System.out.println("Achei!");
            break;
        } else if (i == v.length - 1) {
            System.out.println("Número não encontrado!");
        }

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
