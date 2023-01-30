package inheritance;

import java.math.BigDecimal;

public class Employee extends Student {
    private String title;
    private String employer;
    private char employerGrade;
    private BigDecimal salary;

    public Employee(String name) {
        super(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(char employerGrade) {
        this.employerGrade = employerGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("Employee Name: %s, Title: %s, Employer: %s, Employee Grade: %c, Salary: %s, Email: %s, Phone: %s",
                super.getName(),
                title,
                employer,
                employerGrade,
                salary,
                super.getEmail(),
                super.getPhoneNumber()
        );
    }

}
