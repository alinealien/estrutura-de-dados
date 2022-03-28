package atividade1;
import javax.swing.*;
import java.sql.Array;
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

        boolean par = true;
        int impar = 0;


        for (int i = 0; i < numeros.length; i++) { //para ir de 0 até o tamanho do vetor
            System.out.println("Informe um número: "); // ele vai pedir 10 vezes
            numeros[i] = ler.nextInt(); //vair guardar os numeros

            if(numeros.length% 2 == 0){
                par = true;
            }

        }

        System.out.println("___________________________________");
        Arrays.stream(numeros).forEach(System.out::println); //Imprimiu todos os elementos

    System.out.println();


            }


        }


        /*
    private static Scanner scan;

    public static void main(String[] args) {

        List numerosAll;
        scan = new Scanner(System.in);

        ArrayList<Integer> ListaNumeros = new ArrayList<Integer>(10);

        int i;
        for (i = 0; i < 10; i++) {
            Numeros numeros = new Numeros();
            System.out.println("Digite um numero inteiro:");
            numeros.ListaNumeros = scan.nextInt();

        }
        mostrar(ListaNumeros);

    }

    public static <ListaNumeros> void mostrar(ArrayList<Integer> lista) {
        int i, n = lista.size();

        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));



        }

    }

}*/







