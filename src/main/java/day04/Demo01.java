package day04;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //排序算法:冒泡排序
        int a[] = {6,8,2,3,9,0,4,5,1,7};
        for (int i =0;i<a.length;i++){
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    //追尾赋值
                    int t = a[j];a[j]=a[j+1];a[j+1]=t;
                }
            } 
        }
        System.out.println(Arrays.toString(a));
    }
    
}