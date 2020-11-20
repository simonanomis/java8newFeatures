package bifunctional;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiplyFunction = (a, b) -> a*b;
        System.out.println(multiplyFunction.apply(10, 20));



        ArrayList<Student> students = new ArrayList<>();
        BiFunction<String, Integer, Student> studentFunction = (name, rollNum) -> new Student(name, rollNum);
        students.add(studentFunction.apply("Simona", 100));
        students.add(studentFunction.apply("Marija", 300));
        students.add(studentFunction.apply("Maja", 400));
        for (Student student: students
             ) {
            System.out.println("name: " + student.name);
            System.out.println("roll Number: " + student.rollNum);

        }


        Employee employee = new Employee(101, "Simona", 140);
        TimeSheet timeSheet = new TimeSheet(101, 25);

        BiFunction<Employee, TimeSheet, Double> monthlySalaryFunction = (empl, timesh) -> employee.dailyWage * timeSheet.days;
        System.out.println(monthlySalaryFunction.apply(employee, timeSheet));
    }
}
