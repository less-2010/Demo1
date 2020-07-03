package day08.homework02;

public class BasePlusSalesEmployee extends SalesEmployee {
    static  double basicSalary;
    public void BasePlusSalesEmployee(){
        
    }
    public BasePlusSalesEmployee(double basicSalary,String name, int birthdayMonth, double monthSalesValume,double royaltyRate){
        super(name,  birthdayMonth,  monthSalesValume, royaltyRate);
        this.basicSalary = basicSalary;
    }    

    @Override
    public void getSalary(int month) {
        if(birthdayMonth==month){
            salary+=100;
        }
        
        super.salary = basicSalary+monthSalesValume*royaltyRate+salary;
        System.out.println("高级销售员工："+name+"工资："+salary);
    } 
}