package day08.oop3;

/**
 *     this:代表当前对象对象的引用,this可以调用到本累的属性和方法,this(name,age)也可以调用本类的构造方法
 *     super:调用父类属性和放啊发以及super(name,age)调用父类构造方法
 *     在子类没有重写父类方法的情况下,也可以通过this调用父类方法
 *
 */
public class ThisAndSuper {
    public static void main(String[] args) {
        //继承关系下,会优先走父类的无参构造,再去走子类的无参数构造,可以把一些初始化的工作交给父类无参构造
      PETeacher peTeacher = new PETeacher();
        //输出
        //      教师构造方法
        //      体育老师构造方法

    }
}
