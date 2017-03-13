package Exercicios.AtivPraticaIV.LaisPratica2;

/**
 * Created by lais on 13/03/2017.
 */

//filha do pologono

public class Retangulo extends Poligono{

    //atributo do tipo ponto

    protected Ponto vertice[]= new Ponto[4];

    //metodos que o pai obriga


    public double calcularPerimetro(double base,double altura) {
        double perimetro = (base*2)+(altura*2);

        return perimetro;
    }


    public double calcularArea(double base,double altura) {
        double area = base * altura;

        return area;
    }


    //metodo static de criação

    public static Retangulo create(Ponto pontoA,Ponto pontoB) {
        Retangulo retangulo= new Retangulo();

        //criando os pontos C e D


        if (pontoA.getX() == pontoB.getX() || pontoA.getY() == pontoB.getY()) {

            return null;
        } else {

            Ponto pontoC = new Ponto(pontoA.getX(), pontoB.getY());
            Ponto pontoD = new Ponto(pontoB.getX(),pontoA.getY());

            retangulo.vertice[0]=pontoA;
            retangulo.vertice[1]=pontoB;
            retangulo.vertice[2]=pontoC;
            retangulo.vertice[3]=pontoD;



        }

        //TODO: FINALIZAR IMPLEMENTAÇÃO

        return retangulo;
    }
    public String getString(){

        return "Retangulo";
    }
}


