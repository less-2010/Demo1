package day026.se06;

public class Demo01 {
    public static void main(String[] args) {
//        test();
//        test2();
//        test3();
        test4();
    }

    private static void test4() {//创建线程方法四
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println("匿名内部接口："+i);
                }
            }
        }).start();
    }

    private static void test3() {//创建线程方法三
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println("内部类Thread"+i);
                }
                super.run();
            }
        }.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main线程"+i);
        }
    }

    private static void test2() {//创建线程方法二（主要）
        Run run = new Run();
        Thread t = new Thread(run);
        t.start();
    }

    private static void test() {//创建线程方法一（主要)
        MyThread mt = new MyThread();//new 一个线程对象就可以调用里面的线程
        mt.start();
    }

}

class Run implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Runnable"+i);

        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThread"+i);

        }
    }
}
