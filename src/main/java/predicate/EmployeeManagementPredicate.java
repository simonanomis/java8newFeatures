package predicate;

import java.util.ArrayList;

public class EmployeeManagementPredicate {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);
        System.out.println(employees);
    }

    private static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Simona", "full stack dev", 3000, "Skopje"));
        employees.add(new Employee("Ana", "backend dev", 4000, "Lisbon"));
        employees.add(new Employee("Talha", "frontend dev", 4500, "Otawa"));
    }
}
