package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

import java.util.Date;

/**
 * Created by thiago on 23/03/2017.
 */
public abstract class Employee {
    //implementado primeiro passo da questao 01
    private Date  birthDate;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber,Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate=birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {


        return String.format("%s %s, social security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();

    public Date getBirthDate() {
        return birthDate;
    }
}