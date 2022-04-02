package atividade1;
import java.util.*;

/*2.Desenvolva um algoritmo que leia 10 números inteiros e os armazene sequencialmente em
uma lista. Após isso, o programa deve:

● Imprimir todos os elementos;
● Imprimir somente os elementos pares;
● Imprimir e remover somente os elementos ímpares;
● Imprimir a soma dos elementos da lista.

 */

//FAZENDO...

public class SegundaQuestao {


    public static void imp(int numero[]) {
        System.out.println("\n=== Imprimindo todos numeros ===");
        int i = 0;

        while (i < 10) {

            //System.out.println(numero[i]);
            System.out.println("Todos os numeros: " + numero[i]);

            i++;

        }
    }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeros[] = new int[10];

        int num = 0, i = 0;

        System.out.println("\n=== Lendo os 10 números inteiros ===");
        while (i < 10) {
            System.out.println(" Digite um numero : ");
            num = leitor.nextInt();
            numeros[i] = num;

            i++;
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

        System.out.println("\n=== A Soma dos numeros ===");

        int sum, j;
        for(sum= 0, j = numeros[i] - 1; 0 <= i; sum+= numeros[i--]);
        System.out.println("Array Sum = "+ sum);


            imp(numeros);
            leitor.close();
        }

    }

