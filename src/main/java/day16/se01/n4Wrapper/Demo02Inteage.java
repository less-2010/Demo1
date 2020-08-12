package day16.se01.n4Wrapper;

public class Demo02Inteage {
    public static void main(String[] args) {
        int a = new Integer(1);
//        这里触发了编译器的自动拆箱特性(JDK1.5之后才有)，编译器会
//        在编译后的.class文件中将代码补充为:
//        int a=new Integer(1) . intValue();
//        自动拆箱特性是编译器认可，而不是虚拟机认可。
        Integer i=a;
//        这里触发了自动装箱特性，编译器会将代码补全为:
//        Integer i=Integer . valueOf(a);
//        Integer的equals方法继承自0bject,并且进行了重写，
//        当两个对象包含的值相等时返回true,否则false
        Integer i1=new Integer(10) ;
        Integer i2=new Integer(20) ;
        Integer i3=new Integer(10);
        boolean b12=i1 . equals(i2);
        boolean b13=i1.equals(i3);
        System. out . println(b12);
        System. out. println(b13);
//        其他数字类包装类可自行测试|



    }
}
