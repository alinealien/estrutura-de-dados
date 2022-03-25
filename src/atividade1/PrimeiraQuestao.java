package atividade1;
import java.util.Scanner;

//1. Crie um método recursivo que receba um número inteiro N, calcule e imprima o somatório
//de todos os números de N até 0

public class PrimeiraQuestao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = scan.nextInt(); //recebe numero inteiro
        System.out.println("__________________________");

        int soma = 0;

        for (int somatorio = n; somatorio >= 0; somatorio--) {

            System.out.println(somatorio);
            System.out.println();

            //System.out.println("__________________________");
            System.out.println(soma += somatorio);

        }
    }
}

        /* Fibonacci - teste - OK
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um numero:");
        int n = scan.nextInt(); //recebe numero inteiro

        int somatorio = 1;

        System.out.println(n + "! = ");
        for(int i = n; i >= 1; i--) {
            System.out.println(somatorio);
            somatorio = somatorio * i;

        }

        System.out.println(somatorio); */



