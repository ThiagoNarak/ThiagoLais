package Exercicios.AtivPraticaVI.Questao01e03.Questao02;

/**
 * Created by thiago on 25/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Shape shape[]= new Shape[6];
            TwoDimensionalShape twoDimensionalShape= new TwoDimensionalShape();
            ThreesDimensionalShape threesDimensionalShape = new ThreesDimensionalShape();
           shape[0] = new Circle(3);
            shape[1]= new Triangle(4,5);
            shape[2]=new Square(5);
            shape[3]= new Tetrahedron(3);
            shape[4]=new Sphere(5);
            shape[5]=new Cube(10);
        for (int i = 0; i <shape.length ; i++) {
            if(shape[i] instanceof Circle||shape[i] instanceof Triangle||shape[i] instanceof Square ){

                System.out.println(twoDimensionalShape.getArea(shape[i]));
                System.out.println(shape[i].descricao);
            }else{
                System.out.println("area: "+threesDimensionalShape.getArea(shape[i]));
                System.out.println("volume: "+threesDimensionalShape.getVolume(shape[i]));
                System.out.println(shape[i].descricao);

            }

        }



    }
}
