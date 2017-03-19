package Exercicios.AtivPraticaV.ThiagoLais;

import java.util.Date;

/**
 * Created by thiago on 18/03/2017.
 */
public class Credit extends Pagamento {
    String cardcode,date;
    int parcelas;

    @Override
    public void formaPagamento(double valorFinal) {
        System.out.print("digite o numero do cartao: "+ (cardcode=scanner.nextLine()));
        System.out.println("Data Validade do cartao Ex:MM/AAAA: "+(date=scanner.nextLine()) );
        System.out.println("digite o numero de parcelas: "+ (parcelas=scanner.nextInt()));
        if(parcelas>4){
            double juros=parcelas-4;
            valorFinal=valorFinal*(1+(juros/100));
            System.out.printf("Valor Final das compras: %.2f",valorFinal);
        }
    }
}
