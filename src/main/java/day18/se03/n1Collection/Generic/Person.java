package day18.se03.n1Collection.Generic;

public class Person <Pet,Pay> implements Act<Stand> {
    public Pet getPrt() {
        return pet;
    }

    public void setPrt(Pet pet) {
        this.pet = pet;
    }

    Pet pet;

    public void playPet(Pay pay){System.out.println("表演玩宠物"+this.pet);
    System.out.println("的到报酬"+pay);}
    public void play(Pet pet){ //和传统String比较范围更大，松耦合
        System.out.println("和"+pet+"玩");
    }
    public <T> void show(T t){
        System.out.println("传过来的是:"+t);
    }
//    public  void show2(T t){//定义在某方法上的泛型，只能设置在某方法
//        System.out.println("传过来的是:"+t);
//    }
    public <T1,T2,T3> void show(T1 t1,T2 t2,T3 t3){
    System.out.println("这是拿来卖的:"+t1);
    System.out.println("这是拿来玩的:"+t2);
    System.out.println("这是拿来吃的:"+t3);
    }

    @Override
    public void add(Stand stand) {

    }
}

