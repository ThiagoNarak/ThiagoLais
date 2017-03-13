package Exercicios.AtivPraticaIV.LaisPratica2;

/**
 * Created by lais on 13/03/2017.
 */

//filha do poligono

public class Quadrado extends Retangulo {

    ////metodos que o pai obriga


    public double calcularPerimetro(double base,double altura) {

    double perimetro = base*4;

        return perimetro;
    }

    public double calcularArea(double base,double altura) {
        double area = base * altura;
        return area;
    }
    public String getString(){

        return "quadrado";
    }
}
