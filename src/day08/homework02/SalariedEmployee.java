package day08.homework02;

public class SalariedEmployee extends Employee {
    double monthly_Salary;
    public SalariedEmployee(){}

    public SalariedEmployee(String name, int birthdayMonth,double monthly_Salary) {

        this.monthly_Salary = monthly_Salary;
        super.name = name;
        super.birthdayMonth = birthdayMonth;
    }

    @Override
    public void getSalary(int month) {
        super.getSalary(month);
        super.salary = salary+monthly_Salary; 
        System.out.println("普通员工: "+name+"工资："+salary);
        }
    
}