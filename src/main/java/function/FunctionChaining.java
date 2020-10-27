package function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0, 9);

        System.out.println(function1.apply("SonarLintIssues"));
        System.out.println(function2.apply("SonarLintIssues"));
        System.out.println(function1.andThen(function2).apply("SonarLintIssues"));
        System.out.println(function1.compose(function2).apply("SonarLintIssues"));


        Function<Integer, Integer> function3 = integer -> integer + integer;
        Function<Integer, Integer> function4 = integer -> integer * integer * integer;
        System.out.println(function3.apply(4));
        System.out.println(function4.apply(5));
        System.out.println(function3.andThen(function4).apply(5)); // 5+5 = 10 -> 10*10*10
        System.out.println(function3.compose(function4).apply(5)); // 5*5*5 = 125 -> 125+125

//        f1.andThen(f2).apply(10); => first execute f1.apply(10) method. based on the output first method, f2.apply(result_of_f1_method) method execute.
//        f1.compose(f2).apply(10); => here just opposite to andThen() method. first f2.apply() and then f1.apply(output_of_f2_method) execute.

        Function<String, String> function5 = Function.identity();
        System.out.println(function5.apply("terminal text"));




    }
}
