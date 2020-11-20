package bifunctional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String, String> function = (s, e) -> System.out.println(s+e);
        function.accept("Software", "Engineer");


        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String, Double, Employee> employeeBiFunction = (name, dailyWage) -> new Employee(101, name, dailyWage);
        employees.add(employeeBiFunction.apply("Simona", 140.0));
        employees.add(employeeBiFunction.apply("Marija", 150.0));
        employees.add(employeeBiFunction.apply("Simona", 160.0));

        BiConsumer<Employee, Double> riseDailyWage = (employee, raise) -> employee.dailyWage = employee.dailyWage + raise;
        for (Employee employee: employees
             ) {
            riseDailyWage.accept(employee, 159.00);
            System.out.println("Name: " + employee.name + "'s New Daily Wage: " + employee.dailyWage);
        }
    }


}
