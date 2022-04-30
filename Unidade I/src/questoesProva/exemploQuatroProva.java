package questoesProva;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class exemploQuatroProva {
    //Exemplo FILA = (queue): Adciona os elementos de modo que o primeiro a entrar é o primeiro a sair.
    //A propriedade permite que objetos sejam adicionados na frente e removidos na parte traseira.
    public static void main(String[] args) {

        //LinkedList - Lista Ligada
        Queue<String> fila = new LinkedList<>();

            //Inserindo elementos na fila aqui:
            fila.add("Sirius"); //primeiro elemento adcionado - n
            fila.add("Verônica");
            fila.add("Betty");
            fila.add("Gatinho"); //ultimo elemento adcionado

        System.out.println("Elementos da fila: " + fila);

        String value = (String) fila.remove();
        System.out.println("O primeiro elemento deletado foi : " + value);

        }
    }


