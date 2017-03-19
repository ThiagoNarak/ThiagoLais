package Exercicios.AtivPraticaV.ThiagoLais;

/**
 * Created by thiago on 18/03/2017.
 */
public class Cheque extends Pagamento {
    @Override
    public void formaPagamento(double valorFinal) {
        System.out.println("valor final: "+ valorFinal);
    }
}
