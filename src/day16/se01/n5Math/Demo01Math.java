package day16.se01.n5Math;

public class Demo01Math {
    public static void main(String[] args) {
//        Math类不能new对象，其中的方法使用类名点来调用
//        1、返回参数的绝对值
        System.out.println(Math.abs((-100)));
//        2、返回大于或等于参数的最小的整数。返回值作为double类型
        System.out.println(Math.ceil(3.14));//4.0
        System.out.println(Math.ceil(-3.14));//-3.0
//        3、返回小于或等于参数的最大整数。返回值作为double类型。
        System.out.println(Math.floor(3.14));//3.0
        System.out.println(Math.floor(-3.14));//-4.0
//        4、返回值与参数最接近的整数。返回值作为double类型
        System.out.println(Math.rint(3.14));//3.0
        System.out.println(Math.rint(3.50));//4.0
//        5、根据方法返回值类型返回与参数最接近的long和int类型的值。返回值作为double类型
        long lo = Math.round(3.5);//double参数
        System.out.println(lo);//4
        int in = Math.round(3.49f);//float参数
        System.out.println(in);//3

//        6、返回两个参数中的最小值l
        System. out . println(Math.min(3.49, 3.50));
//        7、返回两个参数中的最大值
        System. out . println(Math . max(0, 100)) ;

    }
}
