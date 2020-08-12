package day01;

public class Demo03 {
    public static void main(final String[] args) {
//      5、运算符和表达式
//      5-1、算数运算符: +,-,*,/,++,--,%

        //      ++ --只能用在变量上
        //      int a=10++;
        int aa=10;
        System. out. println(++aa);
        int bb=20;
        System. out. println(--bb);
        int c=10;
        int d=++c;//先自增后运算
        int e=c++;//先运算后自增
        System.out.println(d);
        System.out.println(e);

//      5-2、 赋值运算符: =,+=,-+,*=,/=,%=
        int f=10;//基本赋值运算符
        f+=5;
        System. out. println(f);
        int s2=2,d2=3,f2=4;//同类型的变量可以同时赋值


//      5-3、 比较运算符: >,<,>=,<=,==,!=
        System.out.println(1>2);
        System.out.println(6>=6);//或者的关系
        System.out.println(8==8);
        System.out.println(8!=8);
        //System.out.println(8=8);
//      5-4、逻辑运算符: &,|,!,&&,| | ,个
        System. out . println(1>2&3>1);
        System. out . println(1>2||3>1) ;


//      5-4、逻辑运算符: &,|,!,^,&&,|| 
        //      &:与逻辑运算符
        System. out . println(1>2&3>1);//并且
        System. out . println(1>2|3>1);//或者
        System. out . println( !true);
        System . out . println(true^true);//相异才为真
        System . out . println(true^false^true );
        //      运算是从左往右依次执行的
        //      &&:双与，又叫短路与
        int and1=1; 
        int and2=2;
        System.out.println(and1!=1&++and2!=2);
        System.out.println(and2);
        int andb1=1;
        int andb2=2;
        System . out . println( andb1 !=1&&++andb2!=2);
        System . out . println(andb2);
        //      短路:如果前面的表达式可以判断整个表达式的值，那么，后面的表达式将不执行(短路)。
        int andc1=1;
        int andc2=2;
        System. out . println(andc1 != 1 || ++andc2 !=2);
        System. out . println( andc2);

//      5-5、连接运算符:+:和加法算符运算符共用一符
        System.out.println( "Hel1o" +"Wor1d");


//      5-5、连接运算符:+:和加法算符运算符共用一符将两个字符串连接在一.起
        int add=100    ;
        System. out. println("add="+add) ;
        //      将字符串和变量里的值(值会变成字符串)连接。
        System . out. println(1+2+"3"+4+5);
        //      运算是从左往右依次执行的。
        System. out. println(9+9+"8"+7+6);
//      5-6、三目运算符:布尔表达式?值1:值2
        System. out. println(3>8?3:8);
        System. out. println(3<8?3:8);
        System. out . println(1>2?1:2);
//      5-7、位运算符:按位进行运算的符号
        //      &、|、~、^、<<、>>、>>>
        //      &:与位运算符
        int a1=1;//0000 ... 0001
        int a2=2;//0000 ... 0010
        int a3=a1&a2; //0000 ...0000
        System. out . println(a3);
        int a4=3;//0000 ... 0011
        int a5=5;//0000....0101
        int a6=a4&a5;//0000 ... 0001
        System. out . println(a6);//1
        //      |:或位运算符
        int ab1=1;//0000 ...0001
        int ab2=2; //0000.... 0010
        int ab3=ab1| ab2;//0000 .... 0011
        System. out . println(ab3);//3
        int ab4=3; //0000....0011
        int ab5=5; //0000...0101
        int ab6=ab4|ab5;//0000 ... 0111
        System. out . println(ab6);
        //      ~:非(取反)位运算符
        int ac1=1;
        int ac2=~ac1;
        System. out . println(ac2);

        // 计算机存储数是以补码形式存储的
        // 正数:补码=反码二原码码取反+1- _符号位不取反
        // 负数:补码=反码+1=原码
        // 正数补码: 0000 ... 0001
        // 取反补码: 111 ... 1110
        // 翻译反码: 1111 ... 1101
        // 翻译原码: 1000 .... 0010
        int ac3=7;
        int ac4=~ac3;
        System.out.println(ac4);//?-8
        // 正数补码: 0000 ... 0111
        // 取反补码: 1111 ... 1000
        // 翻译仅码:1111 ... 0111
        // 翻译原码:1000 ... 1000
        int ac5=-5;
        int ac6 = ~ac5;
        System. out . println(ac6);//? 4
        // 负数原码: 1000 ... 0101
        // 负数反码: 1111 ... 1010
        // 负数补码: 1111 ... 1011
        // 取反补码: 0000 ... 0100
        // 翻译反码: 0000 ... 0100
        // 翻译原码: 0000 ... 0100

        //      <<左移:按位每一一位都想左移动相应位数，末位补日
        int ad1=1;
        int ad2=ad1<<1;
        System. out.println(ad2);//?
        int ad3 = 4;
        int ad4 = ad3<<1;
        System.out.println(ad4);//?8
        int ad5=2;
        int ad6=ad5<<2;// 8
        System.out.println(ad6);//?8
        int ad7=- 210000000;
        int ad8 = ad7 << 1;
        System.out.println(ad8);
        System.out.println(Integer.toBinaryString(ad7));
        System.out.println(Integer.toBinaryString(ad8));

        //      >>:右移:按位进行每一位都向右移动相应位数，高位补充符号位。
        int ae1 = 1;
        int ae2 = ae1 >> 1;
        System.out.println(ae2);
        int ae3=-1;
        System.out.println(Integer.toBinaryString(ae3));
        int ae4=ae3>>1;
        System.out.println(ae4);

        //      无符号右移按位进行每一位都向右移动相应位数，高位无条件补0.
        int af1=1;
        int af2=af1>>>1;
        System. out . println(af2);
        int af3=-1;
        System. out. println(Integer.
        toBinaryString(af3));
        int af4=af3>>>1;
        System. out . println(af4);
        System.out.println(Integer.MAX_VALUE);

        }
}