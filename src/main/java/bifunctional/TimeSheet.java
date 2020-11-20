package bifunctional;

public class TimeSheet {
    int eno;
    int days;

    public TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

    @Override
    public String toString() {
        return "TimeSheet{" +
                "eno=" + eno +
                ", days=" + days +
                '}';
    }
}
