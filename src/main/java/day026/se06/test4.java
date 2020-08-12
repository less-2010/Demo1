package day026.se06;
/**
 * 使用java 多线程模拟 火车票售票系统。 要求是，有三个火车票售票点。
 * 他们都是从 同一个铁路局里面拿的票， 假设铁路局一共有 2000 张票 ，
 * 三个售票点要一起出售这2000张票。
 * Created by admin on 2017/8/5.
 */
public class test4 {

    public static void main(String[] args){
        Windows ticketWindow = new Windows();
        // 定义三个售票窗口
        Thread ticketWindow1 = new Thread(ticketWindow);
        Thread ticketWindow2 = new Thread(ticketWindow);
        Thread ticketWindow3 = new Thread(ticketWindow);

        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();
    }
}

class Windows implements Runnable{
    private int freeTicket = 2000;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
//            锁类对象
            synchronized (Windows.class){
//           锁代码块
//            synchronized(this) {
                if (freeTicket > 0) {

                    System.out.println(Thread.currentThread().getName() + "在出售第" + freeTicket + "张票");
                    freeTicket--;
                } else {
                    break;
                }
            }
        }

    }

}