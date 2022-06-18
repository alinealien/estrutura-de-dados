package provaII;

public class ABB {
    No raiz;
    public void preordem(No arv) {
        if (arv != null) {
            System.out.print(arv.valor + " ");
            preordem(arv.esq);
            preordem(arv.dir);

        }
    }
    public void ordem(No arv) {
        if (arv != null) {
            ordem(arv.esq);
            System.out.print(arv.valor + " ");
            ordem(arv.dir);

        }
    }

    public void posordem(No arv) {
        if (arv != null) {
            posordem(arv.esq);
            posordem(arv.dir);
            System.out.print(arv.valor + " ");
        }
    }

    public No inserir(No arv, Integer valor) {

        if (arv == null)
            arv = new No(valor, null, null);
        else if (valor < arv.valor)
            arv.esq = inserir(arv.esq, valor);
        else if (valor > arv.valor) //chamada recursiva
            arv.dir = inserir(arv.dir, valor);


        return arv;
    }

    public No buscar(No arv, Integer valor) {

        if (arv == null)
            return null;

        if (valor < arv.valor)
            return buscar(arv.esq, valor);

        else if (valor > arv.valor)
            return buscar(arv.dir, valor);


        else
            return arv;

    }


    public void remover(int valor) {
        remover(this.raiz, valor);

    }
    public No remover(No arv, Integer valor) {
        if (raiz == null)
           return null;

        No atual = raiz;
        No pai = raiz;
        boolean filho_esq = true;

        // Aqui ele vai buscando o valor
        while (atual.valor != valor) { // enquanto nao encontrou
            pai = atual;
            if(valor < atual.valor ) { // vai para esquerda
                atual = atual.esq;
                filho_esq = true; // se for filho da esquerda
            }
            else { // caminha para direita
                atual = atual.dir;
                filho_esq = false;
            }
            if (atual == null) return null; // Aqui se ele encontrar a folha -> sai
        } // termina o laço while de busca do valor


        // Se nao possui nenhum filho - ele é uma folha - remove
        if (atual.esq == null && atual.dir == null) {
            if (atual == raiz ) raiz = null; // se raiz
            else if (filho_esq) pai.esq = null; // se for filho a esquerda do pai
            else pai.dir = null; // se for filho a direita do pai
        }

        // Se é pai e nao possui um filho a direita, substitui pela subarvore a direita
        else if (atual.dir == null) {
            if (atual == raiz) raiz = atual.esq; // se raiz
            else if (filho_esq) pai.esq = atual.esq; // se for filho a esquerda do pai
            else pai.dir = atual.esq; // se for filho a direita do pai
        }

        // Se é pai e nao possui um filho a esquerda, substitui pela subarvore a esquerda
        else if (atual.esq == null) {
            if (atual == raiz) raiz = atual.dir; // se raiz
            else if (filho_esq) pai.esq = atual.dir; // se for filho a esquerda do pai
            else pai.dir = atual.dir; // se for  filho a direita do pai
        }

        // Se possui mais de um filho, se for um avô ou outro grau maior de parentesco
        else {
            No sucessor = no_sucessor(atual);
            // Usando sucessor que seria o Nó mais a esquerda da subarvore a direita do No que deseja-se remover
            if (atual == raiz) raiz = sucessor; // se raiz
            else if(filho_esq) pai.esq = sucessor; // se for filho a esquerda do pai
            else pai.dir = sucessor; // se for filho a direita do pai
            sucessor.esq = atual.esq; // acertando o ponteiro a esquerda do sucessor agora que ele assumiu
            // a posição correta na arvore
        }

        return arv;
    }
    // O sucessor é o Nó mais a esquerda da subarvore a direita do No que foi passado como parametro do metodo
    public No no_sucessor(No apaga) { // O parametro é a referencia para o No que deseja-se apagar
        No paidosucessor = apaga;
        No sucessor = apaga;
        No atual = apaga.dir; // vai para a subarvore a direita

        while (atual != null) { // enquanto nao chegar no Nó mais a esquerda
            paidosucessor = sucessor;
            sucessor = atual;
            atual = atual.esq; // caminha para a esquerda
        }

        if (sucessor != apaga.dir) { // se sucessor nao é o filho a direita do Nó que deverá ser eliminado
            paidosucessor.esq = sucessor.dir; // pai herda os filhos do sucessor que sempre serão a direita

            sucessor.dir = apaga.dir; // guardando o ponteiro a direita do sucessor para
            // quando ele assumir a posição correta na arvore
        }
        return sucessor;
    }


    }
