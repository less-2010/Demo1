package day08.homework02;

public class test {
    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee("小明", 20, 150, 6) ;
        // 按小时拿工资的员工，每月工作超出160小时的部分按照1.5倍工资发放。属性：每小时的工资、每月工作的小时数 
        h1.getSalary(6);//小时工  获取六月份的工资
        // h1.getSalary(7);//不能同时调用两次  数据没重置

        SalesEmployee s1 = new SalesEmployee("小花", 5, 200000, 0.2);
        //销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
        s1.getSalary(2);
        // s1.getSalary(5);

        SalariedEmployee salariedEmploye = new SalariedEmployee("小海", 12, 8000);
        // 拿固定工资的员工
        salariedEmploye.getSalary(12);
        // salariedEmploye.getSalary(12);
        BasePlusSalesEmployee b1 = new BasePlusSalesEmployee(5000, "小明名", 6, 200000, 0.2);
        // 有固定底薪的销售人员，工资由底薪加上销售提成部分。属性：底薪。
        b1.getSalary(6);
      







        
    }
    
}