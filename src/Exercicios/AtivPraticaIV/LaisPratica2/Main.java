package Exercicios.AtivPraticaIV.LaisPratica2;

/**
 * Created by lais on 13/03/2017.
 */

public class Main {
    public static void main(String[] args) {

        //criar objeto

        Ponto ponto1 = new Ponto(-3, -2);

        //criando outro objeto

        Ponto ponto2 = new Ponto(-5, -1);

        //estanciando o triangulo

        Retangulo retangulo = new Retangulo();

        retangulo = Retangulo.create(ponto1, ponto2);

        if (retangulo.vertice[0].getX() == retangulo.vertice[2].getX()) {
            double lado = retangulo.vertice[0].getY() - retangulo.vertice[2].getY();
            double base = retangulo.vertice[1].getX() - retangulo.vertice[2].getX();
            if (lado < 0) {
                lado = lado * -1;
            }
            if (base < 0) {
                base = base * -1;
            }
            if (lado == base) {
                Quadrado quadrado = new Quadrado();
                System.out.println(quadrado.getString());
                System.out.println(quadrado.calcularPerimetro(base, lado));
                System.out.println(quadrado.calcularArea(base, lado));


            } else {
                double ladoRetangulo = retangulo.vertice[0].getY() - retangulo.vertice[2].getY();
                double baseRetangulo = retangulo.vertice[1].getX() - retangulo.vertice[2].getX();
                if (ladoRetangulo < 0) {
                    ladoRetangulo = ladoRetangulo * -1;
                }
                if (baseRetangulo < 0) {
                    baseRetangulo = baseRetangulo * -1;
                }
                System.out.println(retangulo.getString());
                System.out.println("Perimetro: " + retangulo.calcularPerimetro(baseRetangulo, ladoRetangulo));
                System.out.println("Area: " + retangulo.calcularArea(baseRetangulo, ladoRetangulo));
            }

        }
    }
}
