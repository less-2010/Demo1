package day15.se01.n1object;

public class Demo04Equals {
    public static void main(String[] args) {
        Person p1 = new Person("小明",18);
        Person p2 = new Person("小艾",19);
        Person p3 = new Person("小明",18);
        System.out.println(p1.equals(p2));// 重写前 false 重写后 false
        System.out.println(p1.equals(p3));//重写前 false  重写后 true
        //默认的是比较地址是否相同，很多时候并不符合业务需求，需要重写

//      △、equals()和==的区别
//      ==可以用于比较基本数据类型的值(最小数据单元)
//      (对于基本数据类型:相同就是相等，相等就是相同)
        System. out . println(1==1) ;
//      ==可以用于比较两个对象是否相同(同时相等)
//      (对于引用数据类型，相同肯定相等)
        System . out . println(p1==p1);
        System. out . println(p1. equals(p1));
//      equals()只能比较两个对象是否相等
//      (对于引用数据类型，相等不一定相同)
        System . out . println(p1. equals(p3));
        System . out . println(p1==p3) ;


    }

}
