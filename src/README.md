# java基础

### 1、变量和常量
        1. 变量的命名
        2. 变量的初始化
        3. 变量
   [代码](/day01/Demo01.java)
### 2、数据类型
<!-- 基础数据类型（四类八种） -->
1. 整数类: 

        - byte 字节型：8bit=1byte:-128~127 
        - short 短整型 16bit=2byte
        - int 整型: 32bit: =4byte
        - 1ong 长整型: 64bit=8byte
        
2. 小数类: 

        - float 单精度浮点型: 32bit=4byte
        - double 双精度浮点型: 64bit=8byte
        
3. 布尔类:

        - boolean 布尔型: 8bit=1byte, 占1bit
        
4. 字符类:

        - char 字符类： 16bit=2byte
    
5. 类型转换：
        
[代码](/day01/Demo02.java)
### 3、运算

###




# 二、面向对象
 ## 5、内部类:
    1) 定义：
        一个类可以定义在另一个类的内部，这个类称为另外-个类的内部类

  ### 5-1、成员内部类:

    当定义的位置是作为一一个成员时，称为成员内部类
    1) 对外不具备可见性，所属外部类则可见。
    2) 内部类可以调用所属外部类的成员。
    3) 内部类有与外部类同名成员会覆盖，可用“外部类.this.成员”来调出外部类的同名成员。
    4) 内部类可以自由访问外部类成员，但是，外部类访问内部类成员需要内部类对象名.调用。
    5) 对外要new内部类对象，得通过外部类的对象进行
    6) 内部类和所属外部类是两个类。参见.class文件
                                
  ### 5-2、局部内部类:
    当定义的位置在方法内或某作用域内时，称为局部内部类
    1) 类似于一个局部变量，只在本方法内或本作用域内定义后有效。
    2) 类似于局部变量，不能用static修饰。

  ### 5-3、 匿名内部类:
    没有类名(匿名)，是对某个类的继承或某个接口的实现
    1) 定义方式:(比较特别) new Class(){}。
    2) 作用:一 般用于实现父类或者接口中的方法。
    3) 唯一的没有构造方法的类一- 没有类名怎么去写构造?
    4) 只可能生成唯一的对 象。
    5) 该对象如果需要引用，只能向上造型。
    6) 可以作为成员内部类存在，也可以作为局部内部类存在。
    7) .class文件名 为: outer$1.class
    
  ### 5-4、静态内部类:
    static修饰的内部类
    1) 只能是成员内部类，不能是局部内部类。
    2) 不能访问外部类的实例成员。
    3) 匿名内部类唯一的对象可以赋值给静态成员。

  ### 5-5、可以实现多继承的效果

 ## 6、访问控制与封装

  ### 6-1、包的概念:

    1) 如果仅仅将类名作为类的唯一标识，则不可避免会出现命名冲突，java中用包的概念来解决命名冲突。在定义类时，第一行必须是声明包的语句， 类的全称是包名加类名。包在存储空间上是以项目开始的文件夹的层次目录。
    2) 正规的包命名规则是域名倒着写，其后跟项目名、模块名。例如:cn. com. zte. project1. register
    3) 访问一个类时，可以使用类的全称，但是这样过于繁琐。
    4) 通过import语句声明了类的全称，该源文件中就可以直接用类名来表示类的全称了
 ## 6-2、访问权限修饰符:
 
  ### 6-2-1、对属性的访问

     1) private修饰的成员:只能在本类中访问。
     2) (defau1t)修 饰的成员:只能在本类和同包中访问。
     3) protected修饰的成员:可以在本类和同包、以及异包的子类中访问。
     4) public修饰的成员:可以在整个项目中访问。
  ### 6-2-2、对类的修饰


 ## 6-3、封装
  ### 6-3-1、封装的概念

     概念：把客观事物抽象成抽象的类，并且类可以把自己的属性和方法只让可以信任的类或者对象进行操作，对不可以信任的类或者对象隐藏，这样的过程叫做封装。

  ### 6-3-2、封装的分类:

     1) 对属性的封装:
        将属性设置为private (私有)，限制其只能在类的内部使用
     2) 对方法的封装:
        将外部可以访问的方法设置为public,不能访问的设置为private
     3) 对私有属性:
        提供get、set方法，可酌情设置密码
     4) 对私有方法:
        提供相应调用，常用场景:懒汉单例模式
        
```java
public class LazySingleton {
  private static LazySingleton ls = null;
  int a = (int) (Math.random()*10000000);
  private LazySingleton(){}
      public static LazySingleton getInstance() {
      if (ls==null) {
          ls=new LazySingleton();
          return ls;
      }else
          return ls;
      }
}

```
    5) 懒汉单例模式（单线程）
```
//(多线程不安全)
//      LazySingleton ls=new LazySingleton();
//      LazySingleton ls2=new LazySingleton();//构造设置为私有才可能单例
        LazySingleton ls3=LazySingleton . getInstance();
        LazySingleton ls4=LazySingleton . getInstance();
        System. out . println(ls3.a);
        System. out . println(ls4.a);//A没有实现单例
``` 
  ### 7-1、方法重写的“两同两小一大”原则

    1) 两同:
        方法名相同，参数列表相同
    2) 两小:
        2-1) 子类方法的返回值类型小于或等于父类的
            2-1-1) void和基本类型时必须相同
            2-2-2) 引用类型时小于或等于
    3) 一大:
        3-1) 子类的访问权限大于或等于父类的 子类的访问控制小于父类的，确保访问父类时一定能访问子类。

  ### 7-2、this和super 关键字的概念和使用场景

    1) this:
        代表本对象。使用场景:在本类中调用本对象。
    2) super: 
        代表本对象的父类对象。使用场景:在子类中调用本对象的父类对象。

  ### 7-3、方法重载和重写的含义，以及为什么要使用方法的重载和重写

    1) 重载:
        1-1)含义:方法名相同，参数列表不同，发生在同一个类中。
        1-2)意义:解决同一个类功能相似但并不相同的行为设计问题。
    2) 重写:
        2-1)含义:方法名相同，参数列表相同，发生在父子类中。
        2-2)意义:解决父子类之间功能相同但表现形态不同的行为设计问题。

  ### 7-4、阐述形参和实参的使用

    1) 形参:
        定义时可以没有实际值，但要有数据类型，可以接受实参传递过来的相应
    数据类型的数据值。
    2) 实参:
        可以是常量，也可以是变量，数据类型必须和形参保持一 致;如果是变量,
    在传递时里面必须存有实际的值。
    3) 传递方式:
        位置对应原则。

  ### 7-5、多态的概念及为何要使用多态
    1) 概念:
        顾名思义，是指多种形态;相同的调用，得到不同的形态结果。不同子类
    或实现类的引用值赋值给父类或父接口的引用变量，调用父类或父接口的方法时，
    会运行不同子类或实现类的不同方法。形成多态的三个前提条件:继承、重写、向上
    造型。
    2) 意义:
        提供统一入口形成约定、提高代码复用性、提高代码可扩展性、降低代码
    的耦合度
  ### 7-6、java中常用关键字
    1)访问控制:
    	private	protected	public				
    2)类，方法和变量修饰符:
    	abstract	class	extends	final	implements	interface	native  new	static	strictfp	synchronized	transient	volatile	
    3)程序控制:
    	break	continue	return	do	while	if	else    for	instanceof	switch	case	default		
    4)错误处理:
    	try	catch	throw	throws	finally		
    5)包相关:
    	import	package					
    6)基本类型:
    	boolean	byte	char	double	float	int	long    short	null	true	false			
    7)变量引用:
    	super	this	void				
    8)保留字:
        goto	const				
  ### 7-7、Java中 流程控制
  1、条件语句
  
        1) if条件语句:
            if语句可以单独判断表达式的结果，表示表达的执行结果，例如
            
```    
    int a = 50;
    if(a > 40){
        return true;
    }return false;
```
  
  
      2) if else:
            如果满足条件，就进行某种处理，否则就进行另一种处理。
```
    int a = 20;
    int b = 30;
    if(a>b){
        return false;
    }else{
        return true;
    }      
          
```
      
   2、 多分支语句
   
        1）if_else_if……
```
    
    int s = 75;
    if (s >= 90) {
        System.out.println("优秀");
    } else if (s >= 80) {
        System.out.println("良好");
    } else if (s >= 70) {
        System.out.println("中等");
    } else if (s >= 60) {
        System.out.println("及格");
    } else {
        System.out.println("不及格");
    }

```
        2) switch 
```
    int num = 6;
    switch (num) {
    case 1:
    System.out.println("代码1");
    break;
    case 2:
    System.out.println("代码2");
    break;
    case 3:
    System.out.println("代码3");
    break;
    default:
    System.out.println("默认");
    }
    System.out.println("结束");

``` 
3、循环语句
   
  1）while 循环语句
  
      while(布尔值){
        表达式
      }
```
    int n = 0;
    while(true){
            num++;
            if(num>100)break;
            System.out.println("❤我的小鱼❤\n"+"❤你醒了❤\n"+num);
        }
```
  
      
  2）do...while 循环
 
     do...while先循环在判断至少执行一次 
      

  3）for 循环语句
  
``` 
   //for循环
   
          for (int i = 0; i < 100; i++) {
              System.out.println("❤"+ i);
          }

  
   //嵌套for循环
          int a=0;
          for(int i=0;i<5;i++){
              for(int j=0;j<5;j++){
                  a++;
                  System. out . println("oK:a="+a+",i="+i+",j="+5);
              }
          }
```   
 
  4）for-each 语句
      
      int array[] = {7, 8, 9};
           for (int arr : array) {
           System.out.println(arr);
      }
       
  ### 7-8、 普通类、抽象类、接口

    1] 相同点:都可以声明引用、都可以向上造型。
    2] 不同点及使用场景:

    1) 普通类:
        有构造方法，可以new对象; 可以写普通方法，不能写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。使用场景:所有对象最终都是通过普通类来描绘的，普通类是new对象的模板。
    2) 抽象类:
        有构造方法，不能new对象;可以写普通方法，也可以写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。使用场景:当某个类不具备足够的信息来描绘一个对象时，可以设置为抽象类;抽象类是对某类事物全部的、正式的抽象，可以对该类事物进行属性和行为上的全面约束。
    3) 接口:
        没有构造方法，不能new对象;不可以写普通方法，只能写抽象方法;不能有成员变量，只能有静态常量;可以多继承。使用场景:当想要对某些类进行行为上的约束，或者行为上也不约束、而只是作为某些类的共同标识时，使用接口;接口是对某些事物方法部分的、撮合性的抽象。 
    
  ###　7-9、权限修饰符及使用范围

    1) public:
        全项目范围
    2) protected: 
        同包以及异包继承或实现
    3) (default):
        同包
    4) private:
        本类型内部
        
  ### 7-10、类成员、实例成员 区别

    1) 类成员:
        static修饰的，属于类的，属性可以类名点调用、也可以对象名点调用，行为必须类名点调用，加载时相对先加载一类加载时即加载。
    2) 实例成员:
        没有static修饰的，属于实例的，属性和行为都必须对象名点来调用，加载时相对后加载一new对 象时实例化。
