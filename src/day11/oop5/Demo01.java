package day11.oop5;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //  二、面向对象
        // x-1、抽共性:当许多类有相同或相似的属性和行为时，我们可以抽共性
        // 形成一个父类(超类)，这个过程叫做泛化。
        // x-1-2、将相同的行为过程的代码抽取出来形成共同的方法，是另一种抽共性。
        // x-2、任何对象都可以通过连调方法object. getClass(). getName()来获得
        // 该对象的完整类名。
    Scanner s=new Scanner(System. in);
    String sStr=s .getClass( ). getName();
    System. out .println(sStr);

    Scanner s2=new Scanner(System. in);
    Son son=new Son( );
    String sonStr=son. getClass( ). getName();
    System. out . println( sonStr);//day11. oop5. Son
    Father f=new Son( );
    String fstr=f . getClass (). getName( );
    System. out . println( fstr);//运行时类名

    }
    
}