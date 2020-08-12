package src.day05.oop1;

public class Class {
    // 类：描述一类对象的行为和状态。
    // 对象：对象是类的一个实例，有状态和行为。

    // Java中的类
    // 定义一个类的基本格式
    // [修饰符] class 类名{

    // 0到多个构造器
    // 0到多个成员变量
    // 0到多个方法
    // 0到多给初始化块
        public static void main(String[] args) {

        Feeder s1 = new Feeder();//实例化Feeder类对象
        s1.name="Dive";
        s1.age=20;
        s1.weight =50;
        s1.feed("番茄", "panda");

        Animal a1 = new Animal();
        a1.name ="panda";
        a1.age=5;
        a1.species="feline";
        a1.eat("番茄", 15);

        Food s2 = new Food();//实例化Feeder类对象
        s2.name="番茄";
        s2.number=30;
        s2.in("番茄", 10);     
    }
    

}


class Feeder{//饲养员类
    //饲养员类对象
    String name;
    int  age;
    int  weight;
    public void feed(String food,String Animal){//技能1
        System.out.println("饲养员"+name+"使用feed()技能给"+Animal+"喂了"+food);
    }
    public void clear(String Animal){//技能2
       // System.out.println("饲养员"+name+"使用clear()技能给"+Animal+"清理了");
    }
}

class Animal{//动物类
    String name;
    String species;
    int  age;
    public void eat(String food,int number){//吃
        System.out.println(name+"吃了"+number+"个"+food);

    }
    public void excrete(){//拉
        System.out.println(name+"拉了臭臭，需要清理~");

    }
}

class Food{//食物类
    String name;
    int number=0; 

    public void in(String name,int number){//增加
        
        System.out.println(name+"增加了"+number);

    }
    public void out(String name,int number){//减少
        
        System.out.println(name+"减少了"+number);

    }


}

