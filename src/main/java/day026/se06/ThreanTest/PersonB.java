package day026.se06.ThreanTest;

public class PersonB extends Thread {

    public PersonB(Account acc) {
        synchronized (Account.class) {
            this.acc = acc;
        }
    }

    Account  acc;
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        withdraw();
    }

    private  void withdraw() {

            for (int i = 0; i < 3; i++) {
                    acc.deposite(2000);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

    }

}
