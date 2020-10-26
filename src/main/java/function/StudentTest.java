package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        populate(students);
        Function<Student, String> calculateGrade =
                student -> {
                    int marks = student.marks;
                    if(marks >= 80) return "A[Distinction]";
                    else if(marks >= 60) return "B[First]";
                    else if(marks >= 50) return "C[Second]";
                    else if(marks >= 35) return "D[Third";
                    else return "E[Failed]";
                };
        students.forEach(student -> {
            System.out.println("max" + student.marks);
            System.out.println(calculateGrade.apply(student));
        });

        Predicate<Student> studentPredicate = student -> student.marks>= 60;
        students.forEach(student -> {
            if(studentPredicate.test(student)) {
                System.out.println("Name: " + student.name);
            }
        });
    }

    private static void populate(ArrayList<Student> students) {
        students.add(new Student("Ana", 100));
        students.add(new Student("Boris", 65));
        students.add(new Student("Dare", 45));
        students.add(new Student("Ivan", 25));
    }
}
