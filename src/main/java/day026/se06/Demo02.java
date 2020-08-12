package day026.se06;

public class Demo02 {
    static Thread t;

    public static void main(String[] args) {
        //1.线程信息获取
//        1)Static Thread currentThread() 返回目前正在执行的线程
//        2)final  String getName();返回线程名称
//        System.out.println(Thread.currentThread().getName());
//        练习: new出 来的线程的对象的名字输出
//        3)final boolean isAlive()判断线程 是否处于活动状态
//        test2();
//        System.out.println("main:" + Thread.currentThread().isAlive());
//        t = Thread.currentThread();
//        4)long getId() 返回该线程的标识符。
//        System.out.println(Thread.currentThread().getId());
//        5) int void getPriority()//获取线程优先级
//        (1~10) 优先级高的执行的概率高
//
//        6) int void setPriority()设置线程优先级
        /*
        * 返回所有活动线程地图的堆栈跟踪的。 地图键是线程，每个地图值的StackTraceElement数组，表示对应的线程的堆栈转储。
        *  返回的堆栈跟踪是在用于指定的格式getStackTrace方法。
        * 线程可以被执行时调用此方法。
        * 每个线程的堆栈跟踪仅代表一个快照，并且每个堆栈跟踪可以在不同的时间来获得。 零长度阵列将在地图中值，如果虚拟机具有约一个线程没有堆栈跟踪信息被返回
        *
        * */
        MyThread mt = new MyThread();
        mt.start();

        test2();

        test3();


    }

    private static void test2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j=0;j<5;j++) {
                    System.out.println("test2()" + Thread.currentThread().isAlive());
                    System.out.println("test2线程名称："+Thread.currentThread().getName());
                    System.out.println("test2线程id:"+Thread.currentThread().getId());
                    System.out.println("test2线程优先级:"+Thread.currentThread().getPriority());
                    System.out.println("test2线程是否活着：" + Thread.currentThread().isAlive());
                    System.out.println(Thread.getAllStackTraces());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                test1();

            }
        }
    }

    private static void test1() {
        Thread t1 = Thread.currentThread();//没有new
        t1.setPriority(1);
//        5)获取线程优先级
        System.out.println("test1优先级:"+t1.getPriority());
        System.out.println("test1线程名称："+t1.currentThread().getName());
        System.out.println("test1线程id:"+t1.currentThread().getId());
        System.out.println("test1线程是否活着：:" + t1.currentThread().isAlive());
//        6)设置线程优先级

//        t.setPriority(5);(1~10) 优先级高的执行的概率高

        System.out.println(t1.getAllStackTraces());
        //        t.stop();
//        System.out.println(2);
    }

    private static void test3(){
        Run ne = new Run();
        Thread t3 = new Thread(ne);
        for (int i = 0; i <5 ; i++) {
            System.out.println("test3线程名称："+t3.currentThread().getName());
            System.out.println("test3线程id:"+t3.currentThread().getId());
            System.out.println("test3线程优先级:"+t3.currentThread().getPriority());
            System.out.println("test3线程是否活着：" + t3.currentThread().isAlive());
            System.out.println(t3.getAllStackTraces());
        }

        t3.start();
    }
}
