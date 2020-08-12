package day12.oop7;

public class Person {
    private int deposit=100000000;
    private int password=123456;
    String house = "高级别墅";
    public int getDeposit(int password) {
        if(password==this . password) {
            return this . deposit;
        }else {
            System. out . println("密码错误");
            return 0;
        }
    }

    private void bathe(){
        System.out.println("洗澡");
    }
    public void camera(int password){
        if (password==123456){
            this.bathe();
        }
    }


}
