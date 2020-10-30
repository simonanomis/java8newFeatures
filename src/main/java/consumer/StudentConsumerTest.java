package consumer;

import function.Student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentConsumerTest {
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

        Consumer<Student> studentConsumer = student -> {
            System.out.println("Name of the student: " +student.name + " and grade of the student is: " + calculateGrade.apply(student));
        };

        students.forEach(student -> {
            studentConsumer.accept(student);
        });

    }

    private static void populate(ArrayList<Student> students) {
        students.add(new Student("Ana", 100));
        students.add(new Student("Boris", 65));
        students.add(new Student("Dare", 45));
        students.add(new Student("Ivan", 25));
    }
}
