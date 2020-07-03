package day13.oop8;

public class A {
    public BB m1(int a){
        return new BB();
    }
    public AA m2(int a){
        return new AA();
    }
    public AA m3(int a){
        return new BB();
    }
//    public BB m4(int a){
//        return new AA();//子类的访问控制小于父类
//    }
}
