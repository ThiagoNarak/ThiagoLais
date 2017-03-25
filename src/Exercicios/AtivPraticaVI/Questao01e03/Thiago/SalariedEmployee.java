package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

import java.util.Date;

/**
 * Created by thiago on 23/03/2017.
 */
public class SalariedEmployee extends Employee{
    private double niver;
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary, Date birthDate){

        // construtor da superclasse

        super(firstName,lastName,socialSecurityNumber,birthDate);

        if(weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    public void setNiver(double niver) {
        this.niver = niver;
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    // calcula os rendimentos
    // sobrescreve o metodo earnings em Employee
    @Override
    public double earnings() {
        return getWeeklySalary()+niver;
    }

    @Override
    public String toString() {
        return String.format("salaried employee : %s %n %s",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}