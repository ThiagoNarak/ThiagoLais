package Exercicios.AtivPraticaIV.Thiago;

import java.util.Scanner;

/**
 * Created by thiago on 11/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        Ponto ponto1= new Ponto(0,0);
        Ponto ponto3= new Ponto(0,0);
        System.out.println("digite X do ponto 1");
        ponto1.setX(entrada.nextDouble());
        System.out.println("digite Y do ponto 1");
        ponto1.setY(entrada.nextDouble());
        System.out.println("digite X do ponto 2");
        ponto3.setX(entrada.nextDouble());
        System.out.println("digite Y do ponto 2");
        ponto3.setY(entrada.nextDouble());
    }
}
