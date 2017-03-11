package Exercicios.ExercicioFixacao.EnumExercicio03;

/**
 * Created by thiago on 11/03/2017.
 */
public enum MesesEnum {
    JANEIRO(1,"Jan"),FEVEREIRO(2,"Fev"),MARCO(3,"Mar"),ABRIL(4,"Abr"),MAIO(5,"Mai"),JUNHO(6,"Jun"),JULHO(7,"Jul"),AGOSTO(8,"Ago"),SETEMBRO(9,"Set"),OUTUBRO(10,"Out"),NOVEMBRO(11,"Nov"),DEZEMBRO(12,"Dez");
    public int mes;
    public String nome;
    MesesEnum(int mes,String nome) {
        this.mes = mes;
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public int getMes() {
        return mes;
    }
}
