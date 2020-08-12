package day05.oop1;

//哲学 思想.编程
//物质 属性 成员变量
//运动 行为 成员方法

public class Person {
    //类属性
    // Static 静态的先加载
    static String enviroment = "地球";
    static String air = "空气";
    static String airnew = air+"净化";//类属性可以访问类属性
    // .static String airnew2 = air2 +"XXX"; //类属性不可以访问实例属性
    public static void breath(){
        System.out.println("呼吸"+air);//类行为可以访问类属性
        // System.out.println("呼吸"+air2);//类行为无法调用实例属性
    }
    public static int test() { return 0;}
    public int test2() { return 0;}
    public static void  test3(){
        breath();//可以访问类型为
        //eat();//不可调用实例行为
        }
    public 
    
    //  成员变量
    // 实列属性
    String air2 = "氧气";
	String name;
    String gender =(int)(Math.random()*2)==1?"男":"女"; //随机性别
    String Addnmress;
    String color;
    int age = 10;   //可以在声明时赋初始值,不推荐
    //  给对象的属性赋初始值
    //  复杂的为属性赋初始值,使用构造方法更方便
    //  若无构造方法，则系统默认提供一个无参空构造
    //  若已有有参构造，则该无参空构造不再提供
   
 public Person(){    //构造方法 无返回值 与类名相同
        System.out.println("正在new Person对象");

        // int g=(int) (Math. random()*2);
        // if(g==1) {
        // this . gender="男" ;
        // }else {
        // this . gender="女";
        // }
        int c=(int) (Math.random( )*4);
        switch(c) {
            case 0:this . color="白";break;
            case 1:this . color="黄";break;
            case 2:this . color="棕";break;
            case 3:this . color="黑";break;
        }
        //this.age =0;

    }
    public Person(String name){ //  构造方法的重写
        this();             //点出本类的构造方法（放在第一行）
        this.name = name;   //点出本对象的成员变量
        this.eat();         //点出本对象的成员方法
                            // this关键字指的是本对象，避免变量匹配的就近原则发生混乱

    }
    int money;

    public Person makeMonney(){
        money+=100;
        System.out.println("赚钱后还有:"+money);
        return this;        //this作为返回值 

    }
    public Person useMonney(){
        money-=50;
        System.out.println("赚钱后还有:"+money);
        return this;        //this作为返回值 

    }    

	public void eat() {//成员方法
		System.out.println("吃饭");
    }
    public void eat(String food){
        //方法的重载：方法名相同，参数列表不同，用来解决相似但不相同的功能
        System.out.println("吃"+food);
    }
	public void sleep(){
		System.out.println("睡觉");
	}
	public void code() {
		System.out.println("敲代码");
    };

    public void introduce(){
        System.out.println("My name is"+this.name);//实例行为可调用类属性 //实例行为也可以调用实例属性
        System.out.println("My age "+ this.age);
        System.out.println("my gender is "+this.gender);
        System.out.println("my Color is"+this.color);

    }



    public static void main(String[] args) {
        // 二、面向对象
        // 1.对象和类
        // 1-1 创建类、对象、及调用
        // 1-1-1 类是创建对象的模版
        

        int a;//局部变量 声明在方法里面
		Person p1 = new Person();//初始化成员变量
        // 1-3、方法的重载
        p1.eat(); 
        p1.eat("帝王蟹");
        // 系统在绑定方法时按照方法签名
        // 1-4、构造方法及其重载
        // 1-4-1、构造方法的作用:为属性赋初始值
        // 1-4-2、构造方法的运行时机:new对象时最后运行
        p1. introduce();
        Person p2=new Person(" 小明");
        System.out.println(p2. name);
    
        // this作为返回值，产生连调效果。
        //1-6、类成员与实例成员
        // 实例:具体的对象，更强调彼此的不同
        // 类成员是属于类的，实例成员是属于实例的
        // 1、类属性与实例属性的区别:
        // 1)类属性是static修饰的，实例属性不被static修饰
        // 2)类属性是属于类的，是所有实例共用的。
        // 3)实例属性是属于实例的，每个实例拥有属于自己独有的实例属性。
    
        Person p3 = new Person();
        
        p2. introduce();

        
        p1.enviroment="火星";
        p1. introduce( );
        p2. introduce( );
        // 3)实例属性是属于实例的，每个实例拥有属于自己独有的实例属性。
        p2. name="小白";
        p1. introduce();
        p2. introduce( );
        // 4)类属性与实例属性的调用方式不同。
        // 1>类属性可以对象名.调用，也可以类名.调用。
        Person. enviroment="地球" ;
        p1. introduce();
        p2. introduce();
       
        // 2>实例属性只能用对象名.调用
        p1.name="小明白";


        // 1-6-2、类成员与实例成员之间的相互访问
            // 1)类行为可以调用类属性，但不能调用实例属性。
            // 2)实例行为可以调用类属性，也可以调用实例属性。
            // 3)类属性可以调用有返回值的类行为，但不能调用有返回值的实例行为。
            // 4)实例属性可以调用有返回值的类行为，也可以调用有返回值的实例行为。
            // 5)类行为可以访问类行为，但不能访问实例行为。
            // 6)实例行为可以访问类行为，也可以访问实例行为。
            // 7)类属性可以访问类属性，但不能访问实例属性。
            // 8)实例属性可以访问类属性，也可以访问实例属性。

            // 9)总之:类成员只能访问类成员，实例成员什么都能访问。

        // 1-6-3、原理:创建类对象的时候，先创建类的成员，再创建实例的成员。
        // 1-6-4、类行为和实例行为的逻辑都是只有一一份，只是在访问限制方面各有不同


        

        

    }
    
}