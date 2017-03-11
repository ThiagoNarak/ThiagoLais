package Exercicios.ExercicioFixacao.EnumExercicio02;

import java.util.Scanner;

/**
 * Created by thiago on 11/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        Esportes esportes= new Esportes();
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite sua modalidade.");
        System.out.println("1 futsal");
        System.out.println("2 natacao");
        System.out.println("3 voleyball");
        int modalidade=entrada.nextInt();
        if(modalidade==1){
            esportes.modalidadeEsportes(ModalidadesEnum.FUTSAL);

        }else{
            if(modalidade==2){
                esportes.modalidadeEsportes(ModalidadesEnum.NATACAO);

            }else{
                if(modalidade==3){
                    esportes.modalidadeEsportes(ModalidadesEnum.VOLEYBALL);

                }else {
                    System.out.println("modalidade inexistente.");

                }
            }
        }
    }
}
