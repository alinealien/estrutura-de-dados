package atividade1;


/* 3 . Faça um programa que armazene os cinco livros a seguir em uma pilha.
● Livros:
○ Capitães da Areia.
○ Dom Casmurro.
○ Auto da Compadecida.
○ Noite na Taverna.
○ O Cortiço.
● Após armazenar os livros na pilha, retire os livros da pilha, imprimindo-os na tela um
por um.*/


//FINALIZADA - POREM - REVISAR COM OS PROFESSORES

import java.util.Stack;

public class TerceiraQuestao {

    public static void main(String[] args) {


        Stack<String> livros = new Stack<>();



        /* Inserindo elementos na pilha */


        livros.push("Capitães da Areia");

        livros.push("Dom Casmurro");

        livros.push("Auto da Compadecida");

        livros.push("Noite na Taverna");

        livros.push("O Cortiço");

        System.out.println("Minha pilha de livros: " + livros);


        /* Removendo elementos da pilha */


        String removido = livros.pop();


        System.out.println("\nLivro " + removido + " foi retirado da pilha.");

        System.out.println("Pilha atual: " + livros);


        removido = livros.pop();

        System.out.println("\nLivro " + removido + " foi retirado da pilha.");

        System.out.println("Pilha atual: " + livros);


        removido = livros.pop();


        System.out.println("\nLivro " + removido + " foi retirado da pilha.");

        System.out.println("Pilha atual: " + livros);


        removido = livros.pop();


        System.out.println("\nLivro " + removido + " foi retirado da pilha.");

        System.out.println("Pilha atual: " + livros);


        removido = livros.pop();


        System.out.println("\nLivro " + removido + " foi retirado da pilha.");

        System.out.println("Pilha atual: " + livros);

    }


}


