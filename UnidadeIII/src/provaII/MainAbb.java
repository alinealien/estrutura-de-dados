package provaII;

public class MainAbb {

    public static void main(String[] args){

        ABB arvore = new ABB();

        arvore.raiz = arvore.inserir(arvore.raiz, 16);
        arvore.inserir(arvore.raiz, 98);
        arvore.inserir(arvore.raiz, 12);
        arvore.inserir(arvore.raiz, 2);
        arvore.inserir(arvore.raiz, 5);
        arvore.inserir(arvore.raiz, 103);
        arvore.inserir(arvore.raiz, 56);
        arvore.inserir(arvore.raiz, 74);

        //arvore.ordem(arvore.raiz);
        //arvore.preordem(arvore.raiz);
        //arvore.posordem(arvore.raiz);

        arvore.remover(98);
        arvore.remover(12);

        //arvore.ordem(arvore.raiz);
        //arvore.preordem(arvore.raiz);
        arvore.posordem(arvore.raiz);


    }
}
