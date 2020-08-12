package day18.se03.n1Collection;

import javax.crypto.Mac;
import java.util.ArrayList;

public class Demo04ArrayList {
    public static void main(String[] args) {
        /**
         *ArrayList集合数据存储的结构是数组结构。元素增删慢，查找快。由于日常
         * 开发中使用最多的功能就是查询数据、遍历数据，所以，ArrayList是 最常用
         * 的集合。但是，倘若我们需求的容器是经常要增删、不怎么查找的话，就不应该
         * 任意的滥用ArrayList。|
         *
         *
         */

//      clone() 复制一个ArrayList到另一个ArrayList中去
        ArrayList oldArray=new ArrayList();
        ArrayList newArray = (ArrayList) oldArray.clone();
    }
}
