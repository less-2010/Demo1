package day12.oop6;

public class Out {

    static class StaticClass {

        int a = 20;
        static int b = 100;

        public static void m1() {
//          a=20;//不能访问所属外部类实例成员变量
            b = 200;//可以访问所属外部类的静态成员变量
        }


    }


    static Other other = new Other() {
    };//匿名内部类唯一的对象可以赋值给 静态成员


    StaticClass s1 = new StaticClass();//静态内部类的实例成员变量
    static StaticClass ss1 = new StaticClass();//静态内部类的静态成员变量

    int a = 10;
    String name = "外部成员类";

    class Inner {
        String name = "内部成员类";
        int aInner = a;//内部类可以调用所属外部类成员
        int ac = m2();
    }

    public void get_name() {

        System.out.println(name);
        System.out.println("外部类.this.成员" + Out.this.name);
    }


    public void m1() {
        Inner inner = new Inner();//内部类对外部不具备可见性所属外部类则可见

    }

    public int m2() {
        return 1;
    }


    public void m3() {
        // LocalInner 1i2=new LocalInner();//本方法内定义前不可使用
        class LocalInner {
        }
        LocalInner li = new LocalInner();//本方法内定义后即可使用
        if (a > 0) {
            class LocalInner2 {

            }
            LocalInner2 litwo = new LocalInner2();
        }
        // LocalInner2 litwo2=new LocalInner2();//超出 作用域，不能使用|
    }

    public void m4() {
        int v = 4;
//   static int vv=20; //局部变量不能声明为static
        class LocalInner3 {

        }
        // static class LocalInner4{

        // }//局部内部类不能声明为static

    }
}