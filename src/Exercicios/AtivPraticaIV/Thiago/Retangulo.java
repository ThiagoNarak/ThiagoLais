package Exercicios.AtivPraticaIV.Thiago;

/**
 * Created by thiago on 11/03/2017.
 */
public class Retangulo extends Poligono {
    protected Ponto[] vertices;

    //-=============METODO

    public static Retangulo criar(Ponto ponto1,Ponto ponto3){
        double subtracaoX= ponto1.getX()-ponto3.getX();
        double subtracaoY=ponto1.getY()-ponto3.getX();
        if(subtracaoX==0||subtracaoY==0){
            return null;
        }
    if(ponto1.getX()>ponto3.getX()){
            if(ponto1.getY()>ponto3.getY()){
                Ponto ponto2 = new Ponto(ponto1.getX(),ponto3.getY());
                Ponto ponto4 = new Ponto(ponto3.getX(),ponto1.getY());
            }else{
                Ponto ponto2 = new Ponto(ponto3.getX(),ponto1.getY());
                Ponto ponto4 = new Ponto(ponto1.getX(),ponto3.getY());
            }
    }else{
        if(ponto3.getY()>ponto1.getY()){
            Ponto ponto2 = new Ponto(ponto3.getX(),ponto1.getY());
            Ponto ponto4 = new Ponto(ponto1.getX(),ponto3.getY());

        }else{
            Ponto ponto2 = new Ponto(ponto3.getX(),ponto1.getY());
            Ponto ponto4 = new Ponto(ponto1.getX(),ponto3.getY());

        }
    }

        //TODO: FINALIZAR IMPLEMENTAÇÃO

    return null ;
    }

    public Retangulo(Ponto ponto1,Ponto poto2,Ponto ponto3,Ponto ponto4){

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
