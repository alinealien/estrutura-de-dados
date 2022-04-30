package atividade1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 4. Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o
nome de 10 pessoas (clientes do banco), armazenando-os em uma fila. O programa deve
imprimir como saída na tela o nome da pessoa e sua posição na fila */

//FINALIZADA = 01/04/2022



public class QuartaQuestao {

    public static void main(String[] args) {

        System.out.println("\n == Fila de Clientes do Banco ==");

        Scanner numero = new Scanner(System.in);

        int i = 0;

        Queue<String> filabanco = new LinkedList<>();

        while (i < 10) {
            System.out.println(" Digite seu nome: ");
            filabanco.offer(numero.nextLine());

            i++;
        }

        /*filabanco.offer("Aelin");
        filabanco.offer("Lorri");
        filabanco.offer("Rose");
        filabanco.offer("Sirius");
        filabanco.offer("Veronica");
        filabanco.offer("Betty");
        filabanco.offer("Kitty");
        filabanco.offer("Debora");
        filabanco.offer("Salvina");
        filabanco.offer("Mariah");*/


            int posicaofila = 1;

            for (String x : filabanco) {
                System.out.println(x + " Sua posição é: " + (posicaofila));

                posicaofila++;

            }

        }
    }


