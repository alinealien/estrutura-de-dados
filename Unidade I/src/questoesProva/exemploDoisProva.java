package questoesProva;

import java.util.ArrayList;
import java.util.Scanner;

public class exemploDoisProva {

    //Listas podem ser implementada por ArrayList, LinkedList, Vector e Stack
    //EXEMPLO DE LISTA:
    public static void main(String[] args) {

        //Scan para ler os numeros
        Scanner numero = new Scanner(System.in);

        //ArrayList
        ArrayList<Integer> meuExLista = new ArrayList<>();

        //Numeros inseridos
        int numeroInserido;

        //Inserindo os elementos na lista
        do {
            System.out.print("Digite um número para a lista: ");
            numeroInserido = Integer.parseInt(numero.nextLine());
            if (numeroInserido != 0) {
                meuExLista.add(numeroInserido);
            }
        } while (numeroInserido != 0); //Ele só irá parar quando o numero informado for 0;

        //Exibir todos os elementos da lista
        System.out.println("- - - Os números da Lista foram - - -");
        for (int i = 0; i < meuExLista.size(); i++) {
            System.out.println(meuExLista.get(i));

        }
    }

}
