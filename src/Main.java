public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add("Сергей",100_000,2);
        employeeBook.add("Андрей",90_000,1);
        employeeBook.add("Владимир",120_000,3);
        employeeBook.printAllEmployees();
        System.out.println();
        employeeBook.update("Сергей",125_000,2);
        employeeBook.add("Евгений",150_000,2);
        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.delete("Владимир");
        employeeBook.printAllEmployees();
    }
}