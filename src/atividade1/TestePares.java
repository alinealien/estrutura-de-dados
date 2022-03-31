package atividade1;

import java.util.Scanner;

public class TestePares {

        public static void imprime(int lista[]){

                System.out.println("\n=== Imprimindo os arrays finais ===");
                int i = 0;
                while ( i < 10) {

                    System.out.println( "Elemento " + (i + 1) + " : " +  lista[i] );

                    i++;
                }

        }
    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        int lista1[] = new int[10];

        int num = 0, i = 0;

        System.out.println("\n=== Lendo os números para o array===");
        while (i < 10) {
            System.out.println(" Digite um numero " + (i));
            num = leitor.nextInt();
            lista1[i] = num;
            System.out.println((i + 1) + " elemento da lista:" + lista1[i]);
            i++;
        }

        System.out.println("\n=== Verificando e imprimindo os pares do array===");
        i = 0;
        while ( i < 10) {

            if (lista1[i] %2 == 0){

                System.out.println(lista1[i] + " é par!");
            }
            i++;
        }
        System.out.println("\n=== Verificando, imprimindo e removendo os impares do array ===");
        i = 0;
        while ( i < 10) {

            if(lista1[i] % 2 != 0){

                System.out.println(lista1[i] + " é impar!");
                lista1[i] = 0;
            }

            i++;

            }

    imprime(lista1);
        leitor.close();
    }
}