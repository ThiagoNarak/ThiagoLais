package Exercicios.AtivPraticaV.ThiagoLais;

/**
 * Created by thiago on 18/03/2017.
 */
public class Vista extends Pagamento {

    @Override
    public void formaPagamento(double valorFinal) {
        valorFinal=valorFinal*0.90;
        System.out.printf("valor A vista: %.2f",valorFinal);
    }
}