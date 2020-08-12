package day08.homework02;

public class HourlyEmployee extends Employee {
    double hourSalary;
    int workingHours;
    public HourlyEmployee(){}
    public  HourlyEmployee(String name, double hourSalary,int workingHours,int birthdayMonth) {
        super.name = name;
        super.birthdayMonth = birthdayMonth;
        this.hourSalary = hourSalary;
        this.workingHours = workingHours;

    }

    @Override
    public void getSalary(int month) {
        super.getSalary(month);
        if(workingHours<=160){
            super.salary = salary+workingHours*hourSalary;
        }else{
            super.salary = salary+(workingHours-160)*hourSalary*1.5+160*hourSalary;
        }
        System.out.println("小时工："+name+"工资："+salary);       
    }

}