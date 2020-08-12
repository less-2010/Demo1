package day026.se06;

public class Demo05 {
    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        Accountx a1= new Accountx();
        Accountx a2= new Accountx();
        Accountx a3= new Accountx();
        Accountx a4= new Accountx();
        new Thread(new Runnable() {
            @Override
            public void run() {
                a1.transfer(a2,800);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                a2.transfer(a1,800);
            }
        }).start();
    }


}
class Accountx {
    static int AUTO = 0;
    int ID = (++AUTO);
    int deposite = 1000;

    void transfer(Accountx a, int money) {
        Accountx max;
        Accountx min;
        if (a.ID > this.ID) {
            max = a;
            min = this;
        } else {
            max = this;
            min = a;
        }
        synchronized(min){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized(max){
            if (money<deposite){
                System.out.println("开锁进入");
                int temp=this.deposite;
                this.deposite=temp-money;
                int tempx = a.deposite;//a2...1000
                a.deposite=tempx+money;//1800,1800
            }


        }
    }


    /**
     * day026.se06.Accountx object internals:
     *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
     *       0    16        (object header)                           N/A
     *      16     4    int Accountx.ID                               N/A
     *      20     4    int Accountx.deposite                         N/A
     * Instance size: 24 bytes
     * Space losses: 0 bytes internal + 0 bytes external = 0 bytes total
     */

}