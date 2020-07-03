package day08.homework02;

public class SalesEmployee extends Employee {
    static double monthSalesValume;
    static double royaltyRate;
    public  SalesEmployee() {}
    public  SalesEmployee(String name, int birthdayMonth, double monthSalesValume,double royaltyRate) {
        super.name = name;
        super.birthdayMonth = birthdayMonth;
        this.monthSalesValume = monthSalesValume;
        this.royaltyRate = royaltyRate;
    }

    @Override
    public void getSalary(int month) {
        super.getSalary(month);
        super.salary = salary + monthSalesValume*royaltyRate;
        System.out.println("低级销售员工："+name+"工资："+salary);
    }
}