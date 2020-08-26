package day07.Enum;

public class WeekTest {
    public static void main(String[] args) {
        Week week = Week.THURSDAY;
        System.out.println(week.compareTo(Week.MONDAY));
        System.out.println(Week.getName("星期二"));
    }
}
