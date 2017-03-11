package Exercicios.ExercicioFixacao.EnumExercicio02;

/**
 * Created by thiago on 11/03/2017.
 */
public class Esportes {

    public void modalidadeEsportes(ModalidadesEnum num){

        switch (num){
            case FUTSAL:
                System.out.println("voce esta na modalidade futsal.");
                break;
            case NATACAO:
                System.out.println("voce esta na modalidade natacao.");
                break;
            case VOLEYBALL:
                System.out.println("voce esta na modalidade voleyball.");
                break;
            default:
                System.out.println("falha ao tentar selecionar modalidade.");
                break;
        }

    }


}
