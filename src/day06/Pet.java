package day06;

public class Pet {
    /*
* 练习:声明一个类Pet，含有属性:性别
* 、物种、年龄、姓名、特长;含有行为:
* 吃、叫、活动。在测试类中new一个该
* 类的对象，调用该对象的叫的行为，为
* 该对象姓名属性赋值后输出该属性值。
*/
//练习：方法重载
//在Pet练习的基础上，创建该类的原来的叫
//的行为的相似行为——根据传入的参数XXX输出
//“和XXX一起叫……”。
//在测试类中测试该方法

//练习：构造方法与this关键字
//在Pet练习的基础上，改造该类的无参构造
//方法，可以自动生成性别和毛色。创建该类的
//另一个构造方法，根据传入的参数XXX可以确定其
//物种，同时也可以自动生成性别和毛色。
//创建该类的introduce方法进行属性介绍。
//在测试类中测试之

// Pet：
// 1、添加生存环境：同样是地球
// 2、添加呼吸：同样是呼吸氧气

    //方式一 
    // static String enviroment = "地球";
    // static String breath = "氧气";
    //方式二
    // String enviroment = "地球";
    // String breath = "氧气";

// 方式一和方式二不推荐

    //方式三
    // static String enviroment;
    // static String breath;
    // 方式四
    String enviroment;
    String breath;
    String sex;
    String species;
    int  age;
    String specialty;
    String color;
    String name ;
    

    public void Pet(){

        this.age =(int)(Math.random()*10);
        this.sex =(int)(Math.random()*2)==1?"公":"母"; //随机性别
        int c=(int) (Math.random( )*4);
        switch(c) {
            case 0:this . color="白";break;
            case 1:this . color="黄";break;
            case 2:this . color="棕";break;
            case 3:this . color="黑";break;
        }
        
    }
    public void Pet(String species){
         
        this.species = species;
       
        this.Pet();
    }


    public  void eat(){


        System.out.println(species+"吃狗粮");
    }
    public  void speak(){
        System.out.println(species+"叫的方式为:旺旺");
    }
    public  void speak(String name){
        System.out.println(species+"和"+name+"一起叫：旺旺！");
    }
    public  void sport(){
        System.out.println("跑");
    }

    public void introduce(){
        System.out.println("年龄："+age);
        System.out.println("性别："+sex);
        System.out.println("物种为: "+species);
        System.out.println("颜色为: "+color);
        System.out.println("呼吸："+ breath);
        System.out.println("生存环境:"+enviroment);
    
    }


    public static void main(String[] args) {
        Pet s1 = new Pet();
        s1.Pet();
        s1.Pet("cat");
        //方式三
        // Pet.enviroment = "地球";
        // Pet.breath = "氧气";
        //方法四
        s1.enviroment="地球";
        s1.breath="氧气";


        s1.introduce();
        
    



    }
}
