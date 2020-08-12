package day01;

public class Demo02 {
    public static void main(final String[] args) {
        
    /*  4、数据类型:节约内存、提高效率
        基本数据类型和引用数据类型
        4-0、基本数据类型: 4类8种
        4-1、整数类
        4-1-1、byte字节型：8bit=1byte:-128~127 
        */
        final byte b=1;
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128
        // 4-1-2、short 短整型 16bit=2byte
        final short s =2;
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768

        // 4-1-3、int整型: 32bit: =4byte:
        final int i=3;//太常用， 优化简写
        // final integer i2=23;
        System . out . println(Integer .MAX_VALUE) ;//2147483647
        System. out. println(Integer .MIN_VALUE);//-2417483648
        // 4-1-4、1ong长整型: 64bit=8byte:
        final long l=4;
        //1ong 1=4;//4整 数常量默认类型是int类型
        // int类型是32bit存储的，而long类 型变量1
        // 是64bit存储的，存得下，不报错。
        
        System. out. println(Long .MAX_VALUE);//9223372036854775807
        System. out. println( Long . MIN_VALUE);//-9223372036854775808


      

        // 4-2、小数类: 2种
        // 4-2-1、double双精度浮点型: 64bit=8byte:
        final double d=5.0;
        System . out . println(Double. MAX_VALUE);//1.7976931348623157E308
        System . out . println(Double . MIN_VALUE);//4.9E-324
        // 4-2-2、float 单精度浮点型: 32bit=4byte:
        //float f=6.0;//报错，数据类型不匹配
        System. out. println (Float.MAX_VALUE); //3.4028235E38
        System . out . println(Float.MIN_VALUE);//1.4E-45

        // 4-2-2-1、小数常量类型默认为double型，64bit存储，
        //而float型的变量是32bit容量，所以放不下。
        //需要指定类型的常量需加标记。
        final float ff=6.0f;//6.0f是float类型的
        


        //    4-3、布尔类
        // 4-3-1、boolean布尔型: 8bit=1byte, 占1bit
        final boolean bo=true;
        final boolean boo=false;
        // boolean bool=1;//数 据类型不匹配
        // System. out.println(Boolean.MAX_VALUE);//报错
        // 4-4、字符类: 1种
        final char c='中';//单引号引起来的内容，放且只能放一一个字符。
        // System.out.println(Char.MAX_VALUE); 报错
        // 4-5、其他进制写法:
        final int a10=100000; //10进制写法
        System. out. println(a10);
        final int a16=0x100000 ;
        System.out.println(a16);
        final int a16_2=0x1010a;
        System.out.println(a16_2);
        int a16_3=0x4D2;
        System.out.println(a16_3);
        // 使用Api计算十进制转十六进制
        Integer ai=1234;
        System.out.println(Integer.toHexString(ai));
        int a8 = 0123;//八进制
        Integer ai8=123;
        System.out.println(Integer.toOctalString(ai8));
        int a2 =0b1;//二进制
        Integer ai2=123;
        System.out.println(Integer.toBinaryString(ai2));

        // 4-6、取整
        // 整数
        System.out.println(9/3);
        System.out.println(9/2);//截尾取整
        // 小数
        System.out.println(9.0/3);
        System.out.println(9.0/2);//保留小数
        System.out.println(8.0/3);//舍入误差 由于二进制和十进制之间转换造成

        
        // 4-7、数据类型转换
        // 4-7-1、小转大，自动转
        // 小转大:取值范围的大小:
        // byte--short--int--1ong--float--double
        byte b11 = 12;
        short s11 = b11;
        s11 = 666;
        int i11 = s11;
        i11 = 888;
        long l11 = i11;
        
        l11=900000000000000000L ;
        float f11=111;//小转 大:取值范围
        f11=3.3F;
        double d11=f11;

        //4-7-1-1、char的取值范围:底层存放的是数字，系统发现数据类型为char时显示为字符。
        //0~65535.
        char c11=97;//底层 是数字
        System. out . println(c11);
        c11='a';
        int i12=97;
        System.out.println(i12) ;
        char c12=65;
        System.out.println(c12);
        char c13 = 66;
        System.out.println(c13);
        // char c14 =65536;//报错：超范围
        char c14 =97;
        int i14=c14; 
        System.out.println(c14);
        System.out.println(i14);
        
        // 4-7-2、大转小，强制转
        // 4-7-2-1、 整数之间强转：
        byte b1=1 ;
        byte b2=127;
        byte b3=(byte)(b1+b2);//超范围,强转，强转符作用域
        System . out . println(b3);//-128 转表强转
        //259->3
        // 4-7-2-2、小数之间强转:精度丢失
        double pi=3.1415926535897932384626433;
        float pif=(float)pi;
        System. out . println(pi);
        System. out . println(pif);

        int i2=10;
        double b22= ( double)i2;
        System. out. println(b22);//添加精度
        // 4-7-3、byte、short、 char 与int转换关系
        int i3=12;
        byte b5=(byte)i3;//大转 小强制转  //jvm转换
        byte b6=12;// 编译器转换

        // 常量优化机制
        //int常量只要不超范围可以直接赋值给byte、short、char.
        //byte b7=129;//超 范围
        //byte、short、char在运算时一律提升为int
        byte b8=1+126;
        byte b9 =1;
        byte b10 = 126;
        //byte b99 = b9+b10;//报错
        //（强转） 
        byte b99 =(byte)(b9+b10);

        //4-7-4、char的强转
        int i97=97;
        System . out . println(i97 );
        System. out. println( (char)i97);
        char c97='a';
        System. out. println(c97);
        System . out.println
        ((int)c97) ;
        //      4-7-5、boolean
        byte by =1;
        boolean bob =true;
        // byte byt =(byte) bat;









    }
        
}