package Exercicios.AtivPraticaV.ThiagoLais;

import java.util.Scanner;

/**
 * Created by lais on 18/03/2017.
 */

// classe pai que vai obrigar as outras classes

public abstract class  Pagamento{
    Scanner scanner = new Scanner(System.in);
    public abstract void formaPagamento(double valorFinal);

}