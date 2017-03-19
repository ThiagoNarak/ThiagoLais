package Exercicios.ExercicioFixacao.ExercicioPolimorfismo;

/**
 * Created by thiago on 18/03/2017.
 */
public abstract class Caixa {
    double valorCaixa;

    public Caixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
    //metodos


    public abstract double SacarPagar(double valor);

}


