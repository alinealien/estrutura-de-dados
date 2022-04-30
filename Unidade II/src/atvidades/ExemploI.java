package src.atvidades;

import java.util.Random;

public class ExemploI {

    public static void main(String[] args) {

        int j;

        int[] vetor = new int [10];
        Random gerador = new Random();

       for (int i = 0; i < 10; i++){
           System.out.println(gerador.nextInt());

       }

    }
}