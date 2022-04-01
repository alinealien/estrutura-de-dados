package atividade1;
import java.util.*;

/*2.Desenvolva um algoritmo que leia 10 números inteiros e os armazene sequencialmente em
uma lista. Após isso, o programa deve:

● Imprimir todos os elementos;
● Imprimir somente os elementos pares;
● Imprimir e remover somente os elementos ímpares;
● Imprimir a soma dos elementos da lista.

 */

public class SegundaQuestao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numeros[] = new int[10]; //Vetor de 10 posições
        int numerosoma;
        int soma;

        int cont = 0, i = 0;


        System.out.println("\n=== Lendo os números para o array===");
        while (i < 10) {
            System.out.println(" Digite um numero " + (i));
            numeros[i] = ler.nextInt();
            System.out.println((i + 1) + " elemento da lista:" + numeros[i]);
            i++;

            System.out.println(numeros[i] + i);
        }

        System.out.println("\n=== Verificando e imprimindo os pares do array===");
        i = 0;
        while (i < 10) {

            if (numeros[i] % 2 == 0) {

                System.out.println(numeros[i] + " é par!");
            }
            i++;
        }

        System.out.println("\n=== Verificando, imprimindo e removendo os impares do array ===");
        i = 0;
        while (i < 10) {

            if (numeros[i] % 2 != 0) {

                System.out.println(numeros[i] + " é impar!");
                numeros[i] = 0;
            }

            i++;

        }

    }
}



