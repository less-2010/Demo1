package day09.oop4;// public class Demo01 {

//     // 2)要么继续声明为抽象类
//     // 4-2-3、抽象方法和抽象类的作用:如果一个类的某些功能比较抽象，或者
//     // 无法在本类中具体实现，可以将这个类声明为抽象类，那么，这些抽象或者无法
//     // 具体实现的功能就可以在子类中完成。
//     // 4-3、抽象类可以用来声明引用，形成向，上造型。
//     Shooter shoot=new Ashe( );
//     // 作业:使用抽象类和抽象方法
//     // 设计一个形状类Shape,方法:求周长和求面积
//     // 形状类的子类:Rect(矩形),Circle(圆形)
//     // Rect类的子类:Square(正方形)
//     // 不同的子类会有不同的计算周长和面积的方法


//     // 4-4、接口:
//     // 4-4-1、概念:
//     // 在软件工程中，经常将-一个大的项目分由不同的开发小组共同开发，各个小组
//     // 的开发工作是并行的。在很多时候，对于不同小组的程序员来说，清楚地说明
//     // 各自的软件如何相互作用，并就此达成统一的“约定”是 很重要的。这种情况下，
//     // 每一小组都可以在对其他小组怎么编写代码- -无所知的情况下，就能编写自己
//     // 的代码，并且各自小组编写的代码能很好的协同工作。接口就是这样的“约定”。
//     // 4-4-2、定义:
//     // [修饰符]interface接口名{ [常量];[抽象方法];[静态方法];}
//     // 4-4-3、实现:
//     // [修饰符]class类名[extends父类名][implements接口1, 接口2,....{类体}
//     // 4-4-4、使用：向上转型

//     // Ski11 ski11=new Ashe( );
//     // ski11.m1();
//     // ski1l.m1();//报错;只能用类型名.来调用静态方法
//     // ski1l. Ashoot();
// // 4-5、接口的作用:
// // 4-5-1、约定作用。/** 文档注释*/


// // 4-5-2、提高程序的重用性。
// // 将属性或参数改为接口后，不必为每一种类的属性或参数都设置--个方法。
// // FengHeGuai fhg=new FengHeGuai( );
// // fhg.AShoot(a);
// // Aobama ao=new Aobama() ;
// // fhg . AShoot(ao);
// // 4-5-3、提高程序的扩展性。
// // 将属性或参数改为接口后，后期可以创建新的实现类来产生新功能。


// public static void main(String[] args) {
    

//     Jess jess = new Jess();

//     jess.skillQ(new Jump());

//     int r= (int)(Math.random()*2);
//     if(r==1){
//             //锤状态
//         jess.skillQ(new Jump());
//     }else {//炮状态
//         jess.skillQ(new Shock());



//         }

//         // 4-5-4、降低程序的耦合度
//         // 将属性或参数改为接口后，当某个实现类的代码发生改变后(比如类名)，
//         // 使用该接口的代码不需要改变。
//         // 耦合度:当其他代码发生改变时，本代码需要改变的越多，耦合度越高!
//         Ashe a2 = new Ashe();
//         a2. ski11W( new FiveArrow());
//         a2. ski11W( new NineArrow());
//         // 4-5-5、实现了多“继承”
//         // 1)类可以多实现接口。
//         // 2)接口可以多继承接口|
// I



//     } 
// }