package day17.se03.n1Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Demo01Collection {
    public static void main(String[] args) {
        /**
         * 集合:
         * 集合是Java提供的一种容器，可以用来存储多个数据。
         * 数组也是容器，但是数组的长度是固定的，集合的长度是可变的。
         * 数组中存储的都是同一类型的元素，可以存储基本数据类型的值;集合存储的都是
         * 对象，而且对象的类型可以不一-致。在开发中，一般对象多的时候，使用集合。
         * 集合按照其存储结构可以分为两大类，分别是单列集合java. util. Collection
         * 和双列集合java. util.Map。
         * Collection:单列集合的根接口，用于存储一系列符合某种规则的元素，它有
         * 两个重要的子接口，分别是java. util. List和java. util。Set。
         * List的特点是元素有序、可重复。Set的特点是元素无序、不可重复。
         * List接口的主要实现类有: java . util.ArrayList和java . util. LinkedList,
         * Set接口的主要实现类有: iava . util. HashSet和iava. util. TreeSet。
         */
//
//        Collection是单列    集合的父接口，我们以它的引用和它的实现类
//        ArrayList的对象(向上造型)来说明它的常用方法。(这些方法  6
//        适用于Collection的所有实现类)
        Collection<String> coll=new ArrayList<String>();
//        添加功能: boolean add(Object o)
        coll.add("xiaomingbai");
        coll.add("小明");
        coll.add("小白");
        System. out . println(coll) ;

//        判断o是否在集合中: boolean contains(E o)
        System. out . println("小明在吗? : "+coll. contains("小明"));
//        删除o元素: remove(E o)
        coll. remove(1);
        System. out. println(coll) ;
//        看集合中还有多少元素: size()
        System. out. println("集合中还有元素: "+coll.size());
//        转换成一个0bject数组: Object[] toArray( )
        Object[]objects=coll. toArray();
        for (int i = 0; i < objects.length; i++) {
            System. out . println(objects [i]);
        }
//        清空集合: clear()
        coll. clear();
        System. out . println(coll) ;
//        判断集合是否为空
        System.out.println("集合空了嘛？"+coll.isEmpty());
//        获取迭代器：Inerator iterator()A


        coll.add("xiaoming");
        coll.add("xiaobai");
        coll.add("ciaomingbai");
//        增强for循环:用来遍历集合或数组.

        System.out.println("foreach:");
        for (Object string : objects) {//元素的数据类型元素的代表变量:集...
            System.out.println(string);
        }
            Iterator it = coll.iterator();
       /* 迭代器也是集合中的一-种，但是它的作用不是存储数据，而是遍历数据。
        它的遍历访问方式简单而言是:问、取、删。*/

        while (it.hasNext()){
            String name =(String)it.next();
            System.out.println(name);
        }
        Iterator ite = coll.iterator();
        while (ite.hasNext()){
            String name = (String)ite.next();
            if (name.length()>2)ite.remove();
        }
        System.out.println(coll);
        System.out.println(coll.size());
        System.out.println(coll.toString().equals(coll));

    }

}
