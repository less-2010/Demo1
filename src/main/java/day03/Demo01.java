package day03;

public class Demo01 {
    public static void main(String[] args) {
        // int hpA=0;
        // while (hpA>10){//先判断在循环
        //     System.out.println("❤我的小鱼❤\n"+"❤你醒了❤\n"+"❤还认识早晨吗❤\n"+"❤昨夜你曾经说❤\n"+hpA);
        //     if(hpA<5)hpA+=10;
        //     hpA-=10;


        // }
  //    do_while
        int hp8 = 0;
        do{//先循环在判断
            System.out.println("❤愿夜幕永不开启。❤ ❤你的香腮边轻轻滑落的,❤ ❤是你的泪❤,❤还是我的泪?❤ ❤初吻吻别的那个季节❤"+hp8);
            if(hp8<5){hp8+=100;}
            hp8-=10;
        }while(hp8>10);
    }
    
}