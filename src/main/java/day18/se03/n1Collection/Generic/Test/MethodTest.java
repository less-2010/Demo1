package day18.se03.n1Collection.Generic.Test;

import java.util.ArrayList;

public class MethodTest {
    public static void change(Integer arr[],int begin,int end){

        for (int i = 0; i < arr.length; i++) {
            Integer temp = arr[i];
            arr[i] = arr[end];
            arr[end] = arr[begin];
        }

    }
    public static void main(String[] args) {
        //编写一个方法，实现指定位置的数组元素交换
        Integer[] integers = new Integer[]{4,6,8,9,7};
//        System.out.println(integers[1]);
    }


}
