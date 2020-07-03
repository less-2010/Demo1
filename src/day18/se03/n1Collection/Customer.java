package day18.se03.n1Collection;

public class Customer {
    Money money = new Money();
    Love love = new Love();
    public void callPlayPet(Person<?, Love> p){
        p.playPet(love);

    }
    public void call(Person<? extends Bird,Money>p){  //确定泛型
        p.playPet(money);

    }

    public void call2(Person<? super Canary,Money>p){
        p.playPet(money);
    }
}
