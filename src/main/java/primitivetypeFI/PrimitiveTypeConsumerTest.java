package primitivetypeFI;

import function.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class PrimitiveTypeConsumerTest {
    public static void main(String[] args) {
        IntConsumer intConsumer = i-> System.out.println(i*i);
        intConsumer.accept(3);

        LongConsumer longConsumer = i -> System.out.println(i*i);
        longConsumer.accept(9);

        DoubleConsumer doubleConsumer = i -> System.out.println(i*3);
        doubleConsumer.accept(5.3);


        List<Integer>
                arr = Arrays.asList(3, 2, 5, 7, 4);
        ObjIntConsumer<List<Integer>>
                objIntConsumer = (list, num) ->
        {
            list.stream()
                    .forEach(
                            a -> System.out.println(a * num));
        };
        objIntConsumer.accept(arr, 2);


        ObjDoubleConsumer<List<Integer> >
                objDoubleConsumer = (list, num) ->
        {
            list.stream()
                    .forEach(
                            a -> System.out.println(a * num));
        };
        objDoubleConsumer.accept(arr, 2.0);

        ObjLongConsumer<List<Integer> >
                objLongConsumer = (list, num) ->
        {
            list.stream()
                    .forEach(
                            a -> System.out.println(a * num));
        };
        objLongConsumer.accept(arr, 200000);


        BiConsumer<Employee, Double> employeeDoubleBiConsumer = ((employee, aDouble) -> employee.salary = employee.salary + aDouble);
        Employee employee = new Employee("Simona",3000);
        employeeDoubleBiConsumer.accept(employee, 500.0);

        ObjDoubleConsumer<Employee> employeeObjDoubleConsumer = (employee1, doubleNumber) -> employee1.salary = employee1.salary +doubleNumber;
        employeeObjDoubleConsumer.accept(employee, 500.0);
    }
}
