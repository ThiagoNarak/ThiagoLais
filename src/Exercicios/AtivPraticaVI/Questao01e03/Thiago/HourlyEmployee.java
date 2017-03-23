package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

/**
 * Created by thiago on 23/03/2017.
 */
public class HourlyEmployee extends Employee{

    // salario por hora
    private double wage;

    //horas trabalhadas durante a semana
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);

        // valida a remuneração
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        // valida horas
        if (hours < 0.0 && hours > 168.0){
            throw new IllegalArgumentException("Hours worked must be >= and <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // configura remuneração
    public void setWage(){
        if(wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hours){
        // valida horas
        if (hours < 0.0 && hours > 168.0){
            throw new IllegalArgumentException("Hours worked must be >= and <= 168.0");
        }

        this.hours = hours;
    }

    public double getHours(){
        return hours;
    }

    // calcula os rendimentos
    @Override
    public double earnings() {

        // sem hora extra
        if (getHours() <= 40 ){
            return getWage() * getHours();
        }else{
            // com hora extra;
            return 40 * getWage() + (getHours() - 40) * getHours() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s %n %s: $%, .2f; %s: %, .2f",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
