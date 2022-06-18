package provaII;

public class No {
    public Integer valor;
    public No esq;
    public No dir;

    public No(Integer valor) {
        this.valor = valor;
    }

    public No(Integer v, No e, No d) {
        valor = v;
        esq = e;
        dir = d;
    }

    public Integer getValor() {
        return valor;
    }

    public void setChave() {

    }

}
