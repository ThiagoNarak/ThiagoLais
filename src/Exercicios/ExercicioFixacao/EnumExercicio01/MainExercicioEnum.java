package Exercicios.ExercicioFixacao.EnumExercicio01;

/**
 * Created by thiago on 11/03/2017.
 */
public class MainExercicioEnum {
    public static void main(String[] args) {

        Dias dia = null; //porque mesmo passando NULL: a variavel continua chamando Dias

    MetodosDias metodosDias= new MetodosDias();

    metodosDias.mostrarDias(dia);

    }
}
