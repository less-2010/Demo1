package day09.oop4;

public interface Skill {//技能接口
    public abstract void Ashoot();//抽象方法：在接口中默认有 abstract
    public static final String CDs ="s";//静态常量 在接口中默认有static final
    public static void m1(){System.out.println("Skill静态方法");};
    //      类似于类，静态方法只能由【类型名.静态方法】来调用
}