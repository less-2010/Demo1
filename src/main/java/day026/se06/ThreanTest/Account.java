package day026.se06.ThreanTest;

public class Account {
    private double blance;

    public synchronized double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public Account() {
    }

    public  Account(double blance) {
        this.blance = blance;
    }

    //存钱
    public  void deposite(double money){
        this.blance+=money;
        System.out.println("存入2000后："+getBlance());
    }
    //取钱
    public  void draw(double money){
        this.blance-=money;
        System.out.println("支取2000后：" + getBlance());
    }
}
