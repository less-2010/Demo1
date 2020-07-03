package day17.se02.Demo01Exception;

public class Demo04 {
    public static void main(String[] args) {
//        自定义异常的三步骤
//        1、定义:一般是继承Exception,重写构....
//        2、设置:将该异常设置在某段代码中，符合条件则抛出
//        3、触发:调用设置了异常的代码，符合条件则触发异常

        Person1 p = new Person1();
        try {

            p.setAge(999999);
        } catch (AgeIllegaException e) {
            System.out.println("我好大！！！");
            e.printStackTrace();
        }
    try {
        p.withdraw(1000001);//编译时不会提醒需要处理异常
    }catch (BalanceNoEnoughException e){
        System.out.println("余额不足");
        e.printStackTrace();
    }finally {
        p.balance+=1000;

    }


    }
}
