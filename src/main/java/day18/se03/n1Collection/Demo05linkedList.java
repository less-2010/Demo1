package day18.se03.n1Collection;

import java.util.LinkedList;

public class Demo05linkedList {
    public static void main(String[] args) {
        /**
         *  LinkedList数据存储结构是链表结构。方便元素添加、删除的集合。
         *  LinkedList是双向链表，在一定程度上缓解了链表查找慢的缺陷。
         *  实际开发中对一个集合元素的添加与删除经常涉及到首尾操作，而LinkedList
         *  提供了大量的首尾操作的方法。
         *
         */

        LinkedList<String>ll=new LinkedList<>();
//        public void addFirst(E e) ;将指定元素插入此列表的开头
        ll.add("小明");
        ll.add("小白");
        ll.add("小明白");
        ll.addFirst("小清楚");
        System. out. println(ll);
//        public void addLast(E e) ;将指定元素添加到此列表的结尾
        ll.addLast("小糊涂" );
        System. out . println(ll);

//        public E getLast(); 返回此列表的最后一个元素
        System. out . println(ll.getLast());
//        public E removeFirst() ;移除并返回此列表的第-一个 元素
        System . out. println(ll. removeFirst());
        System. out . println(ll);
//        public E removeLast();移除 并返回此列表的最后一个元素
        System. out . println(ll. removeLast());
        System. out. println(ll);
//        public E pop(); 从此列表所表示的堆栈处弹出一一个元素
        System. out . println(ll.pop());
        System. out . println(ll);
//        public void push(E e) ;将元素推如此列表所表示的堆栈
        ll.push("好东西");
        System. out . println(ll);
//        public boolean isEmpty(); 如果列表不包含元素则返回true
        System. out . println(ll.isEmpty()) ;
        //在开发时,linkedList可以作为堆栈、队列的数据结构使用




    }
}
