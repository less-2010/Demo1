package day15.se01.n1object;

public class Demo05hasCode {
    public static void main(String[] args) {
        Person p1 = new Person("小明",18);
        Person p2 = new Person("小艾",19);
        Person p3 = new Person("小明",18);
        System.out.println(p1.equals(p2));// 重写前 false  重写后 false
        System.out.println(p1.equals(p3));//重写前 true   重写后 true
        System.out.println("p1.hash:"+p1.hashCode());//重写前 p1.hash:1163157884 重写后 p1.hash:756721
        System.out.println("p2.hash:"+p2.hashCode());//重写前 p2.hash:1956725890 重写后 p2.hash:764002
        System.out.println("p3.hash:"+p3.hashCode());// 重写前  p3.hash:356573597 重写后 p3.hash:756721
//        756721-18/31
//        一般而言，从业务角度来讲，如果两个对象相等，就认为
//        这两个对象相同，就要尽可能的保证两者的哈希码相同。
//        因此，若重写了equals方法，通常也要重写hashCode方法。

    }
}
