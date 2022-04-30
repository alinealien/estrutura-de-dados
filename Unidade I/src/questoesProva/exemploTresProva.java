package questoesProva;

import java.util.Stack;

public class exemploTresProva {

    //EXEMPLO DE PILHA
    public static void main(String[] args){

        Stack<String> exemploPilha = new Stack<String>();

        exemploPilha.push("Corte de Espinhos e Rosas"); //Primeiro a ser adcionado
        exemploPilha.push("Corte de Nevoa e Furia");
        exemploPilha.push("Corte de Asas e Ruinas"); //Ultimo a ser adcionado

        System.out.println("A pilha de livros :" + exemploPilha);

        String retirar = exemploPilha.pop();

        System.out.println("O Livro retirado foi: " + retirar);
    }
}
