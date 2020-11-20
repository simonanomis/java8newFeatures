package bifunctional;

public class Employee {
    int emo;
    String name;
    double dailyWage;

    public Employee(int emo, String name, double dailyWage) {
        this.emo = emo;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emo=" + emo +
                ", name='" + name + '\'' +
                ", dailyWage=" + dailyWage +
                '}';
    }
}
