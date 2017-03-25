package Exercicios.AtivPraticaVI.Questao01e03.Questao02;

/**
 * Created by thiago on 23/03/2017.
 */
public class TwoDimensionalShape extends Shape {


    protected double base,altura,raio;

    public double getArea (Shape shape){
        if(shape instanceof Circle){
            shape.descricao="circulo";
            raio=((Circle) shape).raio;
            return (Math.pow(raio,2))*(Math.PI);
        }else{
            if(shape instanceof Triangle){
                shape.descricao="triangulo";
                base=((Triangle) shape).base;
                altura=((Triangle) shape).altura;
                return (base*altura)/2;
            }else{
                if(shape instanceof Square){
                    shape.descricao="quadrado";
                    base=((Square) shape).base;
                    return (base*base);
                }
            }
        }


        return 0;
    }

}