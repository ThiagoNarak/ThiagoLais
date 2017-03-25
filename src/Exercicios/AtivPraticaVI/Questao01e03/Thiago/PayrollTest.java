package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

import java.sql.Date;

/**
 * Created by thiago on 23/03/2017.
 */public class PayrollTest {

    public static void main(String[] args) {
        Date currentmes =new Date(2017,3,25);


        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "John",
                "Smith",
                "(00) 0000-0000",
                8500.00,
                new Date(1998,3,18));
        PierceWorker pierceWorker = new PierceWorker(
                "lais",
                "amorim",
                "000000000000",
                new Date (1998,4,20),
                4,
                2000);


        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Arnold",
                "Schwarzenegger",
                "(11) 1111-1111",
                18.20,
                40,new Date(1990,3,8)
                );

        ComissionEmployee comissionEmployee = new ComissionEmployee(
                "Donald",
                "Trump",
                "(22) 2222-2222",
                7400.32,
                0.5,
                 new Date(1970,3,21));

        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee(
                "Jack",
                "Chan",
                "(33) 3333-3333",
                10580.45,
                .05,
                400,
                new Date(1949,3,12));

        System.out.println("Employees processed individually");

        System.out.printf("%n %s %n %s : $%, .2f %n %n",
                salariedEmployee,
                "earned",
                salariedEmployee.earnings());

        System.out.printf("%s %n %s : $%, .2f %n %n",
                hourlyEmployee,
                "earned",
                hourlyEmployee.earnings());

        System.out.printf("%s %n %s : $%, .2f %n %n",
                comissionEmployee,
                "earned",
                comissionEmployee.earnings());


        System.out.printf("%s %n %s : $%, .2f %n %n",
                basePlusComissionEmployee,
                "earned",
                basePlusComissionEmployee.earnings());


        // Cria um array Employee de 4 elementos
        Employee [] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;
        employees[4] = pierceWorker;



        System.out.println("Employees processed polymorphically");

        for (Employee currentEmployee : employees) {

            // Automaticamente será chamado o método toString();
            System.out.println(currentEmployee);

            // Realiza o downcast
            // Transforma a referencia da superclasse (abstrata) em subclasse (concreta)

            if (currentEmployee instanceof  BasePlusComissionEmployee){

                BasePlusComissionEmployee employee  = (BasePlusComissionEmployee) currentEmployee;
                employee.setBaseSalary(1.40 * employee.getBaseSalary());
                if(employee.getBirthDate().getMonth()==currentmes.getMonth()){

                    employee.setBaseSalary(employee.getBaseSalary()+100);
                }
                System.out.printf("New base salary with increase is: $%, .2f %n", employee.getBaseSalary());

            }else{
                if(currentEmployee.getBirthDate().getMonth()==currentmes.getMonth()) {
                    if (currentEmployee instanceof SalariedEmployee) {
                        SalariedEmployee employee = (SalariedEmployee) currentEmployee;
                        employee.setNiver(100);
                    }else{
                        if(currentEmployee instanceof  HourlyEmployee){
                            HourlyEmployee employee = (HourlyEmployee) currentEmployee;
                            employee.setNiver(100);
                        }else{
                            if(currentEmployee instanceof ComissionEmployee){
                                ComissionEmployee employee= (ComissionEmployee) currentEmployee;
                                employee.setNiver(100);

                            }else{
                                if(currentEmployee instanceof  PierceWorker){
                                    PierceWorker employee = (PierceWorker) currentEmployee;
                                    employee.setNiver(100);
                                }
                            }
                        }
                    }


                }
            }

            System.out.printf("earned $%, .2f %n %n", currentEmployee.earnings());

            // Para obter o nome do tipo do objeto no vetor employees
            for (int  i = 0; i < employees.length; i++){
                System.out.printf("Employee: %s is a %s %n",
                        i, employees[i].getClass().getName() );
            }
        }
    }
}
