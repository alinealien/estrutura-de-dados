package arvore;

public class No {

    Integer chave; //Pode passar por referencia com o Integer
    String valor;
    No esq, dir;

    public No(Integer c, String v, No e, No d){
        chave = c;
        valor = v;
        esq = e;
        dir = d;



    }
}
