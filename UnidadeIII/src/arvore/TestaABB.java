package arvore;

public class TestaABB {

    public static void main(String[] args){

        ABB arvore = new ABB();

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




        No a1 = arvore.buscar(arvore.raiz, 10, "Chocolate");
        No a2 = arvore.buscar(arvore.raiz, 9, "Batata");
        No a3 = arvore.buscar(arvore.raiz, 8, "Cenoura");
        No a4 = arvore.buscar(arvore.raiz, 7, "Queijo");
        No a5 = arvore.buscar(arvore.raiz, 6, "Cuscus");

        if(a1 != null)
            System.out.println("\n\n***Chave Encontada: " + a1.valor);
        else
            System.out.println("\n\n***Chave Não Encontada " );





        /*ABB arvore = new ABB();

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
