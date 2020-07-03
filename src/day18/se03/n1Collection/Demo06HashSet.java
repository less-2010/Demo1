package day18.se03.n1Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Demo06HashSet {
    public static void main(String[] args) {
        /**
         * Set接口和List接口-样，同样继承自Collection接口，它与Collection接口
         * 中的方法基本-致，并没有功能上的扩充，只是比Col1ection接口更严格了。
         * 与List不同的是，Set接口中的元素是无序的，并且都会以某种规则保证存入
         * 的元素不出现重复。
         * Set集合有多个子类，比如: HashSet, LinkedHashSet.
         * HashSet是Set接口的一个实现类，底层实现是一个HashMap (后期再学)支持。
         * 它根据对象的哈希值来确定元素的存储位置，因此具有良好的查找性能。保证
         * 元素唯-性的方式依赖于: hashCode() 和equals ()]
         */
        HashSet<String> set=new HashSet<String>();
        set.add("小明");
        set.add("小白");
        set.add("小明白");
        set.add("小白");
        for (String name : set) {
            System . out . println(name) ;
        }
//        HashSet存储数据的结构是:哈希表
        HashSet<Student06> set2=new HashSet<>();
        set2. add(new Student06("小明",18));
        set2. add(new Student06("小明",19));
        set2. add(new Student06("小白",18));
        set2. add(new Student06("小明",18));
//        foreach  遍历值
        for (Student06 student : set2) {
            System.out.println(student);
        }

//        当需要向HashSet中存储自定义的类时，要重写hashCode( )和equals()
//        迭代器
        Iterator<Student06> it=set2. iterator() ;
        while(it . hasNext()) {
            Student06 s = it.next();
            System.out.println(s.hashCode());

        }    }
}
