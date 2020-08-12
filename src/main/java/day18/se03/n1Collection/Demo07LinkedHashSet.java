package day18.se03.n1Collection;


import java.util.LinkedHashSet;

public class Demo07LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("小明");
        set.add("小白");
        set.add("小明白");
        set.add("小白");
        for (String name : set) {
            System . out . println(name) ;
        }

    }

}
