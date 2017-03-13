package Exercicios.AtivPraticaIV.Thiago;

/**
 * Created by thiago on 11/03/2017.
 */
public class Retangulo extends Poligono {
    protected Ponto[] vertices;

    //-=============METODO factory

    public static Retangulo criar(Ponto pontoA,Ponto pontoB){
        double subtracaoX= pontoA.getX()-pontoB.getX();
        double subtracaoY=pontoA.getY()-pontoB.getX();


        if(subtracaoX==0||subtracaoY==0){
            return null;
        }else {


            if (pontoA.getX() > pontoB.getX()) { //verificar qual Ponto tem maior X

                if (pontoA.getY() > pontoB.getY()) {

                    Ponto pontoC = new Ponto(pontoA.getX(), pontoB.getY());
                    Ponto pontoD = new Ponto(pontoB.getX(), pontoA.getY());
                } else {
                    Ponto pontoC = new Ponto(pontoB.getX(), pontoA.getY());
                    Ponto pontoD = new Ponto(pontoA.getX(), pontoB.getY());
                }
            } else {
                if (pontoB.getY() > pontoA.getY()) {
                    Ponto pontoC = new Ponto(pontoB.getX(), pontoA.getY());
                    Ponto pontoD = new Ponto(pontoA.getX(), pontoB.getY());

                } else {
                    Ponto pontoC = new Ponto(pontoB.getX(), pontoA.getY());
                    Ponto pontoD = new Ponto(pontoA.getX(), pontoB.getY());

                }
            }
        }

        //TODO: FINALIZAR IMPLEMENTAÇÃO

    return null ;
    }
    //-================CONSTRUTOR==================-
    public Retangulo(Ponto ponto1,Ponto ponto2,Ponto ponto3,Ponto ponto4){

    //TODO: construtor finalizar implementaçao

    }


    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
    public String getTipo(){
        return "Quadrilatero";
    }
}
