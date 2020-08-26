package day07.OverLoading;

public class Test {
    /*方法重载*/
    /*相同的方法名，不同的参数*/
    /*使用场景：构造方法的重载；普通方法的重载*/
    public void eat(){
        System.out.println("什么都吃");
    }
    public void eat(String name,int number){
        System.out.println("吃"+name+"数量："+number);
    }

}
