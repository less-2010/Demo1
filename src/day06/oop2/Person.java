package day06.oop2;
//哲学  思想  编程
//物质  属性  成员变量
//运动  行为  成员方法
public class Person {
	static int test=test();//类属性可以调用有返回值的类行为
//	static int test2=test2();//不能调用有返回值的实例行为
   static String enviroment="地球";//类属性
   String air2New2=air+"OK";//实例属性可以访问类属性
   static String air="空气";
   static String airNew=air+"净化";//类属性可以访问类属性
//   static String airNew2=air2+"XXX";//类属性不能访问实例属性
   String air2="不知道什么气体";
   String air2New=air2+"你牛";//实例属性可以访问实例属性
   
   public static void breath() {//类行为
	   System.out.println("呼吸"+air);//类行为可以访问类属性
//	   System.out.println("呼吸"+air2);//类行为不可以访问实例属性
   }
   public static int test() {return 0;}
   public int test2() {return 0;}
   public static void test3() {
	   breath();//可以调用类行为
//	   eat();//不能调用实例行为
   };
   public void test4() {
	   breath();//可以调用类行为
	   eat();//可以调用实例行为
   }
   
   int test1a=test();//可以调用有返回值的类行为
   int test2a=test2();//可以调用有返回值的实例行为
   String gender=(int)(Math.random()*2)==1?"男":"女";
   //成员变量，声明在类里方法外
   String name;
   public int age=10;//可以在声明属性时赋初始值，不推荐
   String color;//肤色，复杂的为属性赋初始值必须使用构造方法（更方便）
   int height;
   String education;
//   构造方法的用途：给对象的属性赋初始值
//   若无任何构造方法，则系统默认提供一个无参空构造。
//   若已有有参构造，则该无参空构造不再提供。
   public Person() {//不写返回值，方法名同类名
	   System.out.println("正在new Person对象");
//	   int g=(int)(Math.random()*2);
//	   if(g==1) {
//		   this.gender="男";
//	   }else {
//		   this.gender="女";
//	   }
	   int c=(int)(Math.random()*4);
	   switch(c) {
	   case 0:this.color="白";break;
	   case 1:this.color="黄";break;
	   case 2:this.color="棕";break;
	   case 3:this.color="黑";break;
	   }
	   this.age=0;
   }
   public Person(String name) {
	   this();//点出本类的构造方法（放在第一行）
	   this.name=name;//点出本对象的成员变量
//	   this关键字指的是本对象，可以避免变量匹配的就近
//	   原则导致的混乱
	   this.eat();//点出本对象的成员方法
   }
   
   int money=0;
public String wife;
   public Person makeMoney() {
	   money+=100;
	   System.out.println("赚钱后还有钱："+money);
	   return this;//this作为返回值
   }
   public Person useMoney() {
	   money-=50;
	   System.out.println("花钱后还有钱："+money);
	   return this;
   }
   public void eat() {//成员方法
	   System.out.println("吃饭");
   }
   public void eat(String food) {
//	   方法的重载：方法名相同，参数列表不同。
//	   用来解决相似但不相同的功能。
	   System.out.println("吃"+food);
   }
   public void code() {
	   System.out.println("敲代码");
   }
   public void sleep() {
	   System.out.println("睡觉");
   }
   public void introduce() {
	   System.out.println("姓名："+name);//实例行为可以调用实例属性
	   System.out.println("性别："+gender);
	   System.out.println("年龄："+age);
	   System.out.println("肤色："+color);
	   System.out.println("生存环境："+enviroment);
	 //实例行为可以调用类属性
   }
public void Wc() {
}
}
