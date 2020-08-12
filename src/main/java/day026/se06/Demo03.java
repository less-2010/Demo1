package day026.se06;

public class Demo03 {
    static Thread t;
    static Thread tt;

    public static void main(String[] args) {
        //调度
//        1、线程休眠的方法是: Thread. sleep(1ong millis) ;
//        Thread.sleep(long millis, int nanos);
//        2、static void yield()暂停当前正在执行的线程对象，并执行其他线程。
        test1();
//        3、void join()等待该线程终止。
//        void join(long millis)等 待该线程终止的时间最长为millis毫秒。
        test2();
//        Thread . State getState( )返回该线程的状态。
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("t:" + t.getState());

        }
    }

    private static void test1() {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("InnerRunnable" + i);
                    }
                }
            }).start();
            for (int i = 0; i < 20; i++) {
                System.out.println("test1()" + i);
                Thread.yield();
            }
    }

    private static void test2() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("t1Runnable" + i);
                }
                System.out.println(tt.getState());
            }
        });
        System.out.println(t1.getState());
        t = t1;
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    for (int i = 0; i < 20; i++) {
                        System.out.println("t2Runnable" + i);
                    }
                }
            }
        });
        tt = t2;
        t1.start();
        t2.start();
    }
}