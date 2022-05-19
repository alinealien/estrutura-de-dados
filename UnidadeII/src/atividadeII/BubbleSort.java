package atividadeII;

public class BubbleSort {
    //Static = variavel de classe - Global - todas as instancias geradas pelo BubbleSort teram visão global das variaveis.
    //Os metodos poderam acessar as variaves sem passar por parametro

    //variavel de tamanho
    static final int tamanho = 10;

    //Vetor como variavel de classe
    static int elementos[] = new int[tamanho];

    private static int temporaria;

    public static void main(String[] Args) {

        int temporaria = 0;

        //int elementos[] = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //x / elementos neste caso é uma variavel de classe
        //Carga inicial do vetor
        elementos[0] = 64;
        elementos[1] = 137;
        elementos[2] = -16;
        elementos[3] = 43;
        elementos[4] = 67;
        elementos[5] = 81;
        elementos[6] = -90;
        elementos[7] = 212;
        elementos[8] = 10;
        elementos[9] = 75;


        //final quer dizer que a variavel tamanho não pode assumir outro valor (constante)

        //Laço - tamanho é uma variavel estatica de classe
        System.out.println("\nVetor Desordenado");
        for (int y = 0; y < tamanho; y++) {
            System.out.print(elementos[y] + " | ");
        }

        System.out.println();

        for (int a = 0; a < tamanho; a++) {
            System.out.println((a+1) + " a iteração:\n");

            for (int b = 0; b < tamanho - 1; b++) {
                if (elementos[b] > elementos[b + 1]) {

                    temporaria = elementos[b];
                    elementos[b] = elementos[b + 1];
                    elementos[b + 1] = temporaria;


                    System.out.println("Ocorreu uma troca: um novo vetor: ");
                    for (int y = 0; y < tamanho; y++) {
                        System.out.print(elementos[y] + " | ");
                    }

                    System.out.println();

                }

            }
        }
        System.out.println("Vetor Final: impressão dos dados ordenados: ");
        for(int y = 0; y < tamanho; y++){
            System.out.print(elementos[y] + " | ");
        }
    }
}
