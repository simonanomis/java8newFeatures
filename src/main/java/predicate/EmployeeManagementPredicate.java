package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementPredicate {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);
        System.out.println(employees);
        Predicate<Employee> employeePredicate = employee -> employee.designation.equals("backend dev");
        display(employeePredicate, employees);
        Predicate<Employee> employeePredicate1 = employee -> employee.salary < 3000;
        display(employeePredicate1, employees);
        display(employeePredicate.and(employeePredicate1), employees);
        display(employeePredicate.or(employeePredicate1), employees);
        display(employeePredicate.negate(), employees);
        Predicate<String> isBackend = Predicate.isEqual("backend dev");
        fetchBackendDevs(employees, isBackend);

    }

    private static void fetchBackendDevs(ArrayList<Employee> employees, Predicate<String> isBackend) {
        employees.forEach(employee -> {
            if(isBackend.test(employee.designation)) {
                System.out.println("Employee backend: " + employee);
            }
        });
    }

    private static void display(Predicate<Employee> employeePredicate, ArrayList<Employee> employees) {
        employees.forEach(employee -> {
            if(employeePredicate.test(employee)) {
                System.out.println("Employee: " + employee);
            }
        });
    }

    private static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Simona", "full stack dev", 3000, "Skopje"));
        employees.add(new Employee("Ana", "backend dev", 2000, "Lisbon"));
        employees.add(new Employee("Darko", "backend dev", 2500, "London"));
        employees.add(new Employee("Talha", "frontend dev", 4500, "Otawa"));
    }
}
