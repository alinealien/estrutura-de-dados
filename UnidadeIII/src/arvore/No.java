package arvore;

public class No {

    public Integer chave; //Pode passar por referencia com o Integer
    String valor;
    public No esq;
    public No dir;

    public No(Integer c, String v, No e, No d){
        chave = c;
        valor = v;
        esq = e;
        dir = d;



    }



}
