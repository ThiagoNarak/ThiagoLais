package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

import java.util.Date;

/**
 * Created by thiago on 25/03/2017.
 */
public class PierceWorker extends Employee{
    private double niver;
    private double wage;
    private int pierces;

    public PierceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pierces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.pierces = pierces;
    }

    @Override
    public double earnings() {

        return (wage*pierces)+niver;
    }

    public double getNiver() {
        return niver;
    }

    public void setNiver(double niver) {
        this.niver = niver;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPierces() {
        return pierces;
    }

    public void setPierces(int pierces) {
        this.pierces = pierces;
    }
}
