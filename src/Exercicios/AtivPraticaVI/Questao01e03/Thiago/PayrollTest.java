package Exercicios.AtivPraticaVI.Questao01e03.Thiago;

/**
 * Created by thiago on 23/03/2017.
 */public class PayrollTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "John",
                "Smith",
                "(00) 0000-0000",
                8500.00);

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Arnold",
                "Schwarzenegger",
                "(11) 1111-1111",
                18.20,
                40);

        ComissionEmployee comissionEmployee = new ComissionEmployee(
                "Donald",
                "Trump",
                "(22) 2222-2222",
                7400.32,
                .08);

        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee(
                "Jack",
                "Chan",
                "(33) 3333-3333",
                10580.45,
                .05,
                400);

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
        Employee [] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;

        System.out.println("Employees processed polymorphically");

        for (Employee currentEmployee : employees) {

            // Automaticamente será chamado o método toString();
            System.out.println(currentEmployee);

            // Realiza o downcast
            // Transforma a referencia da superclasse (abstrata) em subclasse (concreta)

            if (currentEmployee instanceof  BasePlusComissionEmployee){
                BasePlusComissionEmployee employee  = (BasePlusComissionEmployee) currentEmployee;
                employee.setBaseSalary(1.40 * employee.getBaseSalary());
                System.out.printf("New base salary with 40% increase is: $%, .2f %n", employee.getBaseSalary());
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
