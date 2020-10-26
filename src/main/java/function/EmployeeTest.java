package function;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);
        Function<ArrayList<Employee>, Double> calculateTotalSalary = employee -> {
            double totalSalary = 0;
            for (Employee empl : employees) {
                totalSalary = totalSalary + empl.salary;
            }
            return totalSalary;
        };
        System.out.println("Total Salary: " + calculateTotalSalary.apply(employees));
    };

    private static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Simona",3000));
        employees.add(new Employee("Ana", 2000));
        employees.add(new Employee("Darko",  2500));
        employees.add(new Employee("Talha", 4500));
    }
}
