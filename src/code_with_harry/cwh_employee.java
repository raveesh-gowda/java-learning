package code_with_harry;

import java.util.Objects;

class Employee {
    private long id;
    private String employeeName;
    private String role;
    private String description;

    public Employee(long id, String employeeName, String role, String description) {
        this.id = id;
        this.employeeName = employeeName;
        this.role = role;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(employeeName, employee.employeeName) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeName, role, description);
    }

    @Override
    public String toString() {
        return "Employee Details: {" +
                "id:" + id +
                ", employeeName:'" + employeeName + '\'' +
                ", role:'" + role + '\'' +
                ", description:'" + description + '\'' +
                '}';
    }
}

public class cwh_employee {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Raveesh", "ASE", "Working in CoStrategix");
        Employee employeeTwo = new Employee(1, "Raveesh", "ASE", null);


        System.out.println(employee);

        System.out.println("ID: " + employee.getId() + " NAME: " + employee.getEmployeeName() + " ROLE: " + employee.getRole() + " DECRIPTION: " + employee.getDescription());

        employee.setId(2);
        employee.setEmployeeName("Raghu");
        employee.setRole("MSE");
        employee.setDescription(null);

        System.out.println(employee);

        System.out.println("ID: " + employee.getId() + " NAME: " + employee.getEmployeeName() + " ROLE: " + employee.getRole() + " DECRIPTION: " + employee.getDescription());

        System.out.println(employee.hashCode());
        System.out.println(employee.equals(employeeTwo));
    }

}
