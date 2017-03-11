package Exercicios.ExercicioFixacao.EnumExercicio03;

import java.util.Scanner;

/**
 * Created by thiago on 11/03/2017.
 */
public class Metodos {
        //aprendendo ainda como funciona ENUM.
    public void mesAniversario(MesesEnum meses){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mes do seu aniversario");
        int aniversario=entrada.nextInt();
        System.out.println("digite o mes do ano");
        int mes=entrada.nextInt();

        //so conseguir utilizar o metodo for dessa forma para comparar as informacoes.
        for (MesesEnum num:MesesEnum.values()) {
            if(mes==num.getMes()){
                System.out.println(num.getNome());
            }

        }
        
        
//        System.out.println("mes atual: \t"+meses.getMes());
//        System.out.println("mes Aniversario:\t"+meses.MARCO.getMes());

    }


}
