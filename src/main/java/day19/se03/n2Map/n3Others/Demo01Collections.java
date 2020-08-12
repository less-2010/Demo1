package day19.se03.n2Map.n3Others;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo01Collections {
    public static void main(String[] args) {
//        Collections提供了操作集合的常用算法，这些算法都是以静态方法
//        的形式提供的。这些方法的第-一个参数都是需要操作的集合的引用。
//        Collections提供的多数算符都是针对List类型的，也有部分可以操作任何
//        类型的集合。
//        排序: void sort();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        System. out. println(list);
        Collections. sort(list);
        System. out. println(list);//排序后
//      随机排序:void shuffle()
        Collections.shuffle(list);
        System.out.println(list);
//      反转集合中的顺序:void reverse()
        Collections.reverse(list);
        System.out.println(list);
//      二分查找：int binarySearsh()//只需要知道大量数据时查找快
        System.out.println(Collections.binarySearch(list,15));
        //返回在那个索引位置
        //查找极值：T max(),T min()
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }

}
