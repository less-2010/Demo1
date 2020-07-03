package day02;

public class Demo01 {
    public static void main(String[] args) {

    //8、随机数工具:Math.random():可以产生[0,1)之间的随机小数,double类型   
        double   d = Math.random();
        System.out.println(d);
        //产生[0,10)之间整数
        //强转符号作用域
        int i = (int) (Math.random()*10);
        System.out.println(i);
        //[100-200)
        int a = (int) (Math.random()*100+100);
        System.out.println(a); 
    }
    
}