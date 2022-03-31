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


public class TerceiraQuestao {


    //VER FORMA MAIS SIMPLES - CORRIGIR -
    // SÓ PARA PEGAR A LÓGICA DO CÓDIGO

    public Object[] pilha;
    public int posicaoPilha;
    
    public TerceiraQuestao() {
    this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[5];
// criando uma pilha com 1000 posições
}

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        TerceiraQuestao p = new TerceiraQuestao();
        p.empilhar("Capitães da Areia ");
        p.empilhar("Dom Casmurro ");
        p.empilhar("Auto da Compadecida");
        p.empilhar("Noite na Taverna");
        p.empilhar("O Cortiço");

        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}
