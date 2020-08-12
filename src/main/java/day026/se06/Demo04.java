package day026.se06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        //线程安全：线程锁：当某线程取得该锁后，其他线程需要等待
//        test1();
        test2();
    }

    private static void test2() {
        Account a1 = new Account("小明");
        a1.setID(123,new Account("小明"));
    }

    private static void test1() {
        Account a = new Account("小明");
        new Thread(new Runnable() {
            @Override
            public void run() {
                a.withdraw(500);
                System.out.println("线程1:"+a.deposite);

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                a.withdraw(500);
                System.out.println("线程2:"+a.deposite);
            }
        }).start();
    }
}
class Account{
    int deposite=1000;
    static int ID =1;
    String name;


    static Map<String,Integer> IDS = new HashMap();
    int id = (++ID);


    Account(String name){
        this.name=name;
        IDS.put(name,this.id);
    }

     void setID(int id,Account a) {
        Boolean flag = true;
        Set<String> keys = IDS.keySet();


        for (String key:keys
             ) {
            if (id==IDS.get(key))flag=false;
        }
        if(flag) {
            a.id=id;
            IDS.put(a.name,a.id);
        }
    }

    void withdraw(int money) {
//        synchronized (this) {

            if (deposite > money) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                deposite -= money;
//            }
        }
    }
}