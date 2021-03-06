package arvore;
/*
public class ABB {
    No raiz; //no principal da arvore
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }



    public void preordem(No arv) {
        if (arv != null) {
            System.out.println(arv.chave + " " + arv.valor);
            preordem(arv.esq);
            preordem(arv.dir);

        }
    }

    public void ordem(No arv) {
        if (arv != null) {
            ordem(arv.esq);
            System.out.println(arv.chave + " " + arv.valor);
            ordem(arv.dir);

        }
    }


    //operacao d insercao
    public No inserir(No arv, Integer chave, String valor) {

        //Se o NO tiver reeferencia nula - vamos criar a arvore
        //Cria um novo No passando a chave do valor - chave - valor e subarvores
        if (arv == null)
            arv = new No(chave, valor, null, null); //caso seja nulo, vai passar a chave e o valor null e null
         else if (chave < arv.chave)
            arv.esq = inserir(arv.esq, chave, valor);
         else if (chave > arv.chave) //chamada recursiva
            arv.dir = inserir(arv.dir, chave, valor);


        //Esse retorno da funcao inserir -sempre passarar o endereco da rariz
        return arv;
    }

    //Operacao de Busca
    public No buscar(No arv, Integer chave, String valor) {

            if (arv == null)
                return null;

            if (chave < arv.chave)
                return buscar(arv.esq, chave, valor);

            else if (chave > arv.chave)
                return buscar(arv.dir, chave, valor);


            else
                return arv;

    }


}


*/
