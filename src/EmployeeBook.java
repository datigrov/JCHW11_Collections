import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String,Employee> employees = new HashMap<>();

    public void add(String person, double salary, int departament) {
        Employee employee = new Employee(person, salary, departament);
        employees.put(person, employee);
    }

    public void delete(String person) {
        if (!employees.containsKey(person)) {
            throw new IllegalArgumentException("Данного сотрудника нет в списке");
        }
        employees.remove(person);
    }

    public void delete(int id) {
        Employee nonEmployee = null;
        for (Employee employee : employees.values()) {
            if (employee.getId() == id){
                nonEmployee = employee;
                break;
            }
            if (nonEmployee != null) {
                employees.remove(nonEmployee.getPerson());
            }else {
                throw new IllegalArgumentException("Данного сотрудника нет в списке");
            }
        }
    }

    public void update(String person, double salary, int departament) {
        if (!employees.containsKey(person)) {
            throw new IllegalArgumentException("Данного сотрудника нет в списке");
        }
        Employee employee = employees.get(person);
        employee.setSalary(salary);
        employee.setDepartment(departament);

    }

    public void printAllEmployees() {
        for (Employee employee : employees.values()) {
                System.out.println(employee);
        }
    }
    public void printAllEmployees(int departament){
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == departament) {
                System.out.println(employee);
            }
        }
    }



    public double getSum() {
        double sum = 0;
        for (Employee employee : employees.values()) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public double getSum(int departament) {
        double sum = 0;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == departament) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public Employee getMinSalaryEmployee() {
        Employee minSalary = null;
        for (Employee employee : employees.values())
            if (minSalary == null || minSalary.getSalary() < employee.getSalary()) {
                minSalary = employee;
            }
        return minSalary;
    }

    public Employee getMinSalaryEmployee(int departament) {
        Employee minSalary = null;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            if (minSalary == null || minSalary.getSalary() < employee.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }


    public Employee getMaxSalaryEmployee() {
        Employee maxSalary = null;
        for (Employee employee : employees.values())
            if (maxSalary == null || maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        return maxSalary;
    }

    public Employee getMaxSalaryEmployee(int departament) {
        Employee maxSalary = null;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            if (maxSalary == null || maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public double getAverageSalary() {
        double sum = 0;
        int employeesNum = 0;
        for (Employee employee : employees.values()) {
            employeesNum++;
            sum = sum = employee.getSalary();
        }
        return sum / employeesNum;
    }

    public double getAverageSalary(int departament) {
        double sum = 0;
        int employeesNum = 0;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            employeesNum++;
            sum = sum + employee.getSalary();
        }
        return sum / employeesNum;
    }

    public void printAllNames() {
        for (Employee employee : employees.values()) {
            System.out.println(employee.getPerson());
        }
    }

    public void printAllNames(int departament) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() != departament) {
                System.out.println(employee.getPerson());
            }
        }
    }

    public void increaseSalary(int percent) {
        for (Employee employee : employees.values()) {
            employee.setSalary(employee.getSalary() + employee.getSalary()/100*percent);
        }
    }

    public void increaseSalary(int percent, int departament) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary()/100*percent);
        }
    }

    public void printAllWithSmallSalary(double bound) {
        for (Employee employee : employees.values()) {
            if (employee.getSalary() <= bound) {
                System.out.println(employee);
            }
        }
    }
    public void printAllWithBigSalary(double bound) {
        for (Employee employee : employees.values()) {
            if (employee.getSalary() > bound) {
                System.out.println(employee);
            }
        }
    }
}
