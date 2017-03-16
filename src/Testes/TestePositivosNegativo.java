package Testes;

/**
 * Created by thiago on 13/03/2017.
 */
 class Quadrado {

    int variavel;
    public Quadrado(int variavel) {
        this.variavel = variavel;
    }


}
public class TestePositivosNegativo {
    public static void main(String[] args) {

       Quadrado quadrado= new Quadrado(5);
        Quadrado quadrado2= new Quadrado(5);

        String a="a";
        String b="a";
//        a=b;
        if(a==b){
            System.out.println("professorrrr");
        }
        if(a.equals(b)){
            System.out.println("professorrrr equalssss");
        }
       if(quadrado.equals(quadrado2)){

           System.out.println("iuu");

       }


    }
}
