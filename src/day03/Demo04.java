package day03;

import java.util.Arrays;

public class Demo04 {
    /*
    *java基础____数组常用方法
    */
    public static void main(String[] args) {
//  数组的复制_____System.arraycopy()
    //  System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        /*
         *src,原数组
         *srcPos,原数组的起始位置
         *dest,目标数组
         *destPos,目标数组的起始位置
         *需要复制的元素个数
         */

        //  例
         int []a = {10,23,30,40,50};
         int []b = new int [4];
         System.arraycopy(a, 1, b, 0, 4);
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(b));


        //  数组复制练习1：
        //  随机产生10个int类型[0,100)的数据存入数组，并输出；
        //  截取下标从3(含)至7(含)的元素存入另一个数组并输出。
         int arr1[] = new int[10];
         int arr11[] = new int[5];
         for (int i = 0; i < arr1.length; i++) {
            arr1[i] =(int) (Math.random()*100);
            
         }
         System.out.println(Arrays.toString(arr1));
         System.arraycopy(arr1, 3, arr11, 0, 5);
         System.out.println(Arrays.toString(arr11)); 
        
//  数组复制2____Arrays.copyOf()
        //  Arrays.copyOf(int[] original, int newLength)
        //  int[] original：目标数组
        //  int newLength：新长度

        //  数组复制练习2：
        //  随机产生5个int类型的[0,100)数据存入数组，并输出；
        //  使用Arrays.copyOf()在以上数组基础上扩容出一共
        //  含8个元素的数组，并在新元素位置存放随机产生的3个
        //  [0,500)元素，并输出。
       
        int arr2[] = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] =(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr2));
        int arr3[] = Arrays.copyOf(arr2, 8);
        for (int i = 0; i<arr3.length; i++) {
            if(i>=5){
                arr3[i] =(int) (Math.random()*500);
            }
        }
        System.out.println(Arrays.toString(arr3)); 

//      输出数组内容3_____Arrays.toString()
    //  Arrays.toString(array)
        

    }
    
}