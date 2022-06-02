package arvore;

public class TestaABB {

    public static void main(String[] args){
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
    }
}
