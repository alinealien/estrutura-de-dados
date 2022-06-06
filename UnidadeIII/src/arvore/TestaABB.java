package arvore;

import java.util.Scanner;

public class TestaABB {

    public static void main(String[] args) {

        System.out.println("------------------- TESTE I -------------------");

        ABB arvore = new ABB();

        //arvore.raiz = arvore.inserir(null, 0, "Produtos");

        //Dez alimentos;
        arvore.raiz = arvore.inserir(arvore.raiz, 1, "Banana");
        arvore.inserir(arvore.raiz, 2, "Maçã");
        arvore.inserir(arvore.raiz, 3, "Uva");
        arvore.inserir(arvore.raiz, 4, "Feijão");
        arvore.inserir(arvore.raiz, 5, "Arroz");
        arvore.inserir(arvore.raiz, 6, "Cuscus");
        arvore.inserir(arvore.raiz, 7, "Queijo");
        arvore.inserir(arvore.raiz, 8, "Cenoura");
        arvore.inserir(arvore.raiz, 9, "Batata");
        arvore.inserir(arvore.raiz, 10,"Chocolate");

        //Cinco Eletrodomesticos
        arvore.inserir(arvore.raiz, 11, "Notebook");
        arvore.inserir(arvore.raiz, 12, "Televisão");
        arvore.inserir(arvore.raiz, 13, "Geladeira");
        arvore.inserir(arvore.raiz, 14, "Batedeira");
        arvore.inserir(arvore.raiz, 15, "Ventilador");

        //Cinco Produtos de limpeza
        arvore.inserir(arvore.raiz, 16, "Banana");
        arvore.inserir(arvore.raiz, 17, "Maçã");
        arvore.inserir(arvore.raiz, 18, "Uva");
        arvore.inserir(arvore.raiz, 19, "Feijão");
        arvore.inserir(arvore.raiz, 20, "Arroz");

        arvore.preordem(arvore.raiz);

        //COM O METODO BUSCAR
        arvore.buscar(arvore.raiz, 1, "Banana");
        arvore.buscar(arvore.raiz, 2, "Maçã");
        arvore.buscar(arvore.raiz, 3, "Uva");
        arvore.buscar(arvore.raiz, 4, "Feijão");
        arvore.buscar(arvore.raiz, 5, "Arroz");
        arvore.buscar(arvore.raiz, 6, "Cuscus");
        arvore.buscar(arvore.raiz, 7, "Queijo");
        arvore.buscar(arvore.raiz, 8, "Cenoura");
        arvore.buscar(arvore.raiz, 9, "Batata");
        arvore.buscar(arvore.raiz, 10,"Chocolate");


        System.out.println("-----------------------------------------------");

        Scanner busca = new Scanner(System.in);

        System.out.println("Digite um produto para pesquisa:");
        //Integer produto = busca.nextInt();
        String produto = busca.nextLine();

       // int numS = Integer.parseInt(produto);

        if(produto == arvore.raiz.getValor()){
            System.out.println("Produto encontrado" + " " + arvore.raiz.getValor());
        } else {
            System.out.println("Produto não encontrado" + " " + produto);
        }




       // No result = String.valueOf(ab.buscar(a1, 1, "Banana"));

        /*if(prod == )
            System.out.println("\n\n***Chave Encontada: ");
        else
            System.out.println("\n\n***Chave Não Encontada ");



        //if (prod ) {
          //  System.out.println("\n\n***Chave Encontada: ");
        //} else {
          //  System.out.println("\n\n***Chave Não Encontada ");


            //a1.imprimir(); - Ele imprime valor e chave do a1


       /* Scanner buscar = new Scanner(System.in);

        System.out.println("Digite um produto para pesquisa:");
        String prod = buscar.nextLine();*/

        /*No r = ab.buscar(a1, 1, "Banana");

        //Um laço para fazer a verificação se o numero pesquisado esta ou não no vetor
        if(r != null)
            System.out.println("\n\n***Chave Encontada: " + r.valor);

        a2 = ab.buscar(a1, 1, "Banana");

        if(a2 != null)
            System.out.println("\n\n***Chave Encontada: " + a2.valor);
        else
            System.out.println("\n\n***Chave Não Encontada " );*/



        /*
        No a1 = new No(1,"Banana", null, null);
        No a2 = new No(2,"Maçã", a1, null );
        No a3 = new No(3,"Pera", a2, null);
        No a4 = new No(4,"Uva", a3, null);
        No a5 = new No(5,"Melancia", a4, null);
        No a6 = new No(6,"Batata", a5, null);
        No a7 = new No(7,"Cenoura", a6, null);
        No a8 = new No(8,"Beteraba", a7, null);
        No a9 = new No(9,"Manga", a8, null);
        No a10 = new No(10,"Chocolate", a9, null); //<= 10 alimentos

        No e11 = new No(11,"TV", a10, null);// >=11 eletroinicos
        No e12 = new No(12,"Geladeira", e11, null);
        No e13 = new No(13,"Fogão", e12, null);
        No e14 = new No(14,"Liquidificador", e13, null);
        No e15 = new No(15,"Ventilador", e14, null);

        No l16 = new No(16,"Banana", e15, null);
        No l17 = new No(17,"Agua Sanitaria", l16, null);
        No l18= new No(18,"Sabão em pó", l17, null);
        No l19 = new No(19,"Desinfetante", l18, null);
        No l20 = new No(20,"Amaciante",l19, null);

        System.out.println("PRODUTOS");

        ABB ab = new ABB(a1);


        //ab.raiz = a20;

        ab.raiz = l20;

        //ab.preordem(ab.raiz);

        ab.ordem(ab.raiz);

        System.out.println("-----------------------------------------------");

        //a1.imprimir(); - Ele imprime valor e chave do a1


        Scanner buscar = new Scanner(System.in);

        System.out.println("Digite um produto para pesquisa:");
        String prod = buscar.nextLine();

        No r = ab.buscar(a1, 1, "Banana");

        //Um laço para fazer a verificação se o numero pesquisado esta ou não no vetor
        if(r != null)
            System.out.println("\n\n***Chave Encontada: " + r.valor);

        a2 = ab.buscar(a1, 1, "Banana");

        if(a2 != null)
            System.out.println("\n\n***Chave Encontada: " + a2.valor);
        else
            System.out.println("\n\n***Chave Não Encontada " );


               No no = new No(1, "Banana",
                new No(2, "Maça", null, null),
                new No(3, "Pera",
                new No(4, "Uva",
                new No(5, "Melancia",
                new No(6, "Batata",
                new No(7, "Cenoura",
                new No(8, "Beterraba",
                new No(9, "Manga",
                new No(10,"Chocolate",null), null))))))));

        ABB ab = new ABB(no);

        ab.raiz = no;
        ab.ordem(ab.raiz);

        System.out.println("Ordenado: " );





         */



         /*
        ABB arvore = new ABB();
        arvore.raiz = arvore.inserir(null, 20, "Produtos");

        //Dez alimentos;
        arvore.inserir(arvore.raiz, 1, "Banana");
        arvore.inserir(arvore.raiz, 2, "Maçã");
        arvore.inserir(arvore.raiz, 3, "Uva");
        arvore.inserir(arvore.raiz, 4, "Feijão");
        arvore.inserir(arvore.raiz, 5, "Arroz");
        arvore.inserir(arvore.raiz, 6, "Cuscus");
        arvore.inserir(arvore.raiz, 7, "Queijo");
        arvore.inserir(arvore.raiz, 8, "Cenoura");
        arvore.inserir(arvore.raiz, 9, "Batata");
        arvore.inserir(arvore.raiz, 10,"Chocolate");
        arvore.preordem(arvore.raiz);

        //Cinco Eletrodomesticos
        arvore.inserir(arvore.raiz, 11, "Notebook");
        arvore.inserir(arvore.raiz, 12, "Televisão");
        arvore.inserir(arvore.raiz, 13, "Geladeira");
        arvore.inserir(arvore.raiz, 14, "Batedeira");
        arvore.inserir(arvore.raiz, 15, "Ventilador");

        //Cinco Produtos de limpeza
        arvore.inserir(arvore.raiz, 16, "Banana");
        arvore.inserir(arvore.raiz, 17, "Maçã");
        arvore.inserir(arvore.raiz, 18, "Uva");
        arvore.inserir(arvore.raiz, 19, "Feijão");
        arvore.inserir(arvore.raiz, 20, "Arroz");


        arvore.buscar(arvore.raiz, 10, "Chocolate");
        arvore.buscar(arvore.raiz, 9, "Batata");
        arvore.buscar(arvore.raiz, 8, "Cenoura");
        arvore.buscar(arvore.raiz, 7, "Queijo");
        arvore.buscar(arvore.raiz, 6, "Cuscus");


        if(arvore != null)
            System.out.println("\n\n***Chave Encontada: " );
        else
            System.out.println("\n\n***Chave Não Encontada " );





        ABB arvore = new ABB();

        arvore.raiz = arvore.inserir(null, 20, "a");
        arvore.inserir(arvore.raiz, 15, "b");
        arvore.inserir(arvore.raiz, 40, "c");
        arvore.inserir(arvore.raiz, 7, "d");
        arvore.inserir(arvore.raiz, 17, "e");
        arvore.inserir(arvore.raiz, 70, "f");
        arvore.inserir(arvore.raiz, 16, "g");
        arvore.inserir(arvore.raiz, 55, "h");


        arvore.preordem(arvore.raiz);

        No r = arvore.buscar(arvore.raiz, 55);

        if(r != null)
            System.out.println("\n\n***Chave Encontada: " + r.valor);

        No r1 = arvore.buscar(arvore.raiz, 100);

        if(r1 != null)
            System.out.println("\n\n***Chave Encontada: " + r1.valor);
        else
            System.out.println("\n\n***Chave Não Encontada " );

         */
        }
    }
