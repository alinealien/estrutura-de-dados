package arvore;

public class No {
    public Integer chave;
    public String valor;
    public No esq;
    public No dir;

    public No(Integer c, String v, No e, No d){
        chave = c;
        valor = v;
        esq = e;
        dir = d;

    }


    public Integer getChave() {
        return chave;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


}
