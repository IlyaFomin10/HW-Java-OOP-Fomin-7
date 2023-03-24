import java.util.*;


public class Employee {
    private String firstname;
    private String lastname;
    String department;
    double salary;

    public Employee(String firstname, String lastname, String department, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;
        return firstname.equals(employee.firstname) && lastname.equals(employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstname, this.lastname);
    }

    @Override
    public String toString() {
        return "Сотрудник " + firstname + " " + lastname + " из отдела " + department + " с з/п: " + salary;
    }
}