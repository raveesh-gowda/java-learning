package inheritance;

import java.math.BigDecimal;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee employee = new Employee("Raveesh");

        employee.setEmail("rav55sh@gmail.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setTitle("ASE");
        employee.setEmployer("CoS");
        employee.setEmployerGrade('A');
        employee.setSalary(new BigDecimal("50000"));

        System.out.println(employee);
    }

}
