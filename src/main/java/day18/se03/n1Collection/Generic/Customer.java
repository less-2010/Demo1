package day18.se03.n1Collection.Generic;

/**
 * 顾客类
 */
public class Customer {
    Money money = new Money();
    Love love = new Love();

    /**
     * 玩宠物方法
     * @param p
     */
    public void allPlayPet(Person<?, Love> p){
        p.playPet(love);
    }
    public void call(Person<? extends Bird,Money>p){  //确定泛型
        p.playPet(money);

    }

    public void call2(Person<? super Canary,Money>p){
        p.playPet(money);
    }
}
