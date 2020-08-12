package day17.se02.Demo01Exception;

public class Person1 {
    int age =0;
    int balance = 10000;

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeIllegaException {
        if(age>10000||age<0){
            throw new AgeIllegaException("年龄非法");
        }
        this.age = age;
    }

    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money){
        if(balance-money<0){
            throw new BalanceNoEnoughException("钱不够了！！！");
        }
        balance-=money;
    }
}
