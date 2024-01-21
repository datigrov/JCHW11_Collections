import java.util.Objects;

public class Employee {
    private String person;
    private double salary;
    private int department;
    private int id;
    private static int personalId = 1;

    public Employee(String person, double salary, int department) {
        this.person = person;
        this.salary = salary;
        this.department = department;
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getPersonalId() {
        return personalId;
    }

    public static void setPersonalId(int personalId) {
        Employee.personalId = personalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && department == employee.department && id == employee.id && Objects.equals(person, employee.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, salary, department, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person='" + person + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }
}
