package Exercicios.AtivPraticaV.Thiago_2;

/**
 * Created by thiago on 17/03/2017.
 */
public class Produto {
private int codigo;
private double valor;
private String Descriçao;

    public Produto(int codigo, double valor, String descriçao) {
        this.codigo = codigo;
        this.valor = valor;
        Descriçao = descriçao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescriçao() {
        return Descriçao;
    }

    public void setDescriçao(String descriçao) {
        Descriçao = descriçao;
    }
}
