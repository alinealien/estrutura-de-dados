package atividade1;
import java.util.Scanner;


/*1. Crie um método recursivo que receba um número inteiro N, calcule e imprima o somatório
de todos os números de N até 0

RECURSÃO:
Recursão é um método de programação no qual uma função chama a si mesma.
A recursão é utilizada quando queremos resolver um subproblema do mesmo tipo menor.


*/

public class PrimeiraQuestao {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println(" Digite um numero: ");
        int resultado = somatorio (numero.nextInt());

        System.out.println(resultado);

        int num = 0, i = 0;
        int somatorio;



        }


    static int somatorio(int numero) {

        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }


    }
}


