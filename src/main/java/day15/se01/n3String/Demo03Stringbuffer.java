package day15.se01.n3String;

public class Demo03Stringbuffer {
    public static void main(String[] args) {
        test(); //线程不安全
        test2();//线程安全消耗大
//        当我们确定该容器是单线程调用时，可以使用StringBuilder
//        节约开销，否则，我们选择StringBuffer保证线程安全。
//        两者在方法功能上则是相同的。
//        字符串类总结:
//        String字符串是常量，-旦创建无法修改。
//        StringBuilder和StringBuffer是可变字符串，创建之后仍可修改。
//        StringBuilder是线程不安全的，开销小; StringBuffer是线程安全的，开销大

    }

    private static void test() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <100 ; i++) {
            new Thread(){
                public  void  run(){
                    for (int j = 0; j < 1000; j++) {
                        str.append("a");
                    }
                }
            }.start();

        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str.length());
    }
    private static void test2() {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i <100 ; i++) {
            new Thread(){
                public  void  run(){
                    for (int j = 0; j < 1000; j++) {
                        str.append("a");
                    }
                }
            }.start();

        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str.length());
    }

}
