package Exercicios.AtivPraticaVI.Questao01e03.Questao02;

/**
 * Created by thiago on 23/03/2017.
 */


public class ThreesDimensionalShape extends Shape {
    protected double lado,raio;

    public double getArea(Shape shape){
        if(shape instanceof Sphere ){
            shape.descricao="esfera";
            return (4*((Math.PI)*((Sphere) shape).raio*2));
        }else{
            if(shape instanceof Tetrahedron){
                shape.descricao="tetraedro" ;
                return (Math.sqrt(3)*((Tetrahedron) shape).lado*2);
            }else{
                if(shape instanceof Cube){
                    shape.descricao="cubo";
                    return 6*((((Cube) shape).aresta)*2);
                }
            }
        }


        return 0;
    }
    public double getVolume(Shape shape){
        if(shape instanceof Sphere){

        return (4*((Math.PI)*((Sphere) shape).raio*3))/3;
        }else{
            if(shape instanceof Tetrahedron){
                return ((((Tetrahedron) shape).lado*3)*Math.sqrt(2))/12;
            }else{
                if(shape instanceof Cube){
                    return ((Cube) shape).aresta*((Cube) shape).aresta*((Cube) shape).aresta;
                }
            }
        }
        return 0;
    }
}