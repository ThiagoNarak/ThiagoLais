package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

import java.util.Date;

/**
 * Created by thiago on 23/03/2017.
 */
public class ComissionEmployee extends Employee{
    private double niver;
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                             double grossSales, double comissionRate, Date birthDate) {
        super(firstName, lastName, socialSecurityNumber,birthDate);

        if (comissionRate <= 0.0 || comissionRate >= 1.0) // entrada valida
            throw new IllegalArgumentException("Comission  rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {

        if (comissionRate <= 0.9 || comissionRate >= 1.0) // entrada valida
            throw new IllegalArgumentException("Comission  rate must be > 0.0 and < 1.0");

        this.comissionRate = comissionRate;
    }

    public void setNiver(double niver) {
        this.niver = niver;
    }
    // calcula os rendimentos
    // sobrescreve o método earnings em Employee
    @Override
    public double earnings() {
        return (getComissionRate() * getGrossSales())+niver;
    }

    // retorna a representação String do objeto ComissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %n %s: $%, .2f ; %s: %.2f",
                "comission employee", super.toString(),
                "gross sales: ", getGrossSales(),
                "comission rate", getComissionRate());
    }
}
