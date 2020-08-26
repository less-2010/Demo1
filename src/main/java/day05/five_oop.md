# OOP_类和对象
## OOP定义：
```text
Object Orieented Programming 面型对象编程，是编程思想中最重要的概念

在OOP之前我们是面向过程编程

面向过程编程：把一个项目在一个类中去写，把一个时间分成每一步去执行，比如c语言

面向过程的弊端：

1、代码在一个类中，自上而下执行，代码耦合度高，后期拓展和维护成本高

2、代码自上而下执行，代码复用性不高

面向对象：以对象为核心，把这个事件分析出几个对象，
```
## 类和对象

```text
1、类：（ class ) 归类，把相同特征的属性和方法归为一类，类里面有属性和方法，是构造对象的模板或蓝图 ，是一个抽象的概念

2、对象： 是类中抽象概念的一个具体的一个实例，是具体的 

由类构造 （ construct ) 对象的过程称为创建类的实例 （ instance ) 。

对象也是一种存储形式，存储对象的不同属性

3、类和对象的联系：

类里面有属性和方法，想要调用里面的属性或方法需要创建一个类对象来调用(私有的除外)

4、优势： 代码复用，提高工作效率

```
```java
/**
*创建学生类
*学生属性
**/

public class Student{
//特征：属性,全局变量也叫实例变量
    String name;
    int age;
    char sex;
    String StudentNo;
//行为：方法
    public void Study(){
        System.out.println("学生学习");
    }
}
/**
*测试类
**/
public class Test{
    public static void main(String[] args){
    Student s = new Student();
    s.Study();
    }
}
```
