package day03;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
//  #数组1
        //  需求：声明100个变量，赋值wei[0,100)随机整数 并输出
        int a= 67;
        int b = 34;
        int a01,a02,a03;
        int []arr= new int [100];
        arr[10]=101;//数组元素访问通过下标，下标从0开始
        System.out.println(arr[10]);
        System.out.println(arr[11]);//元素默认有初始值
        int ar ;
        //System.out.println(ar);//变量未经初始化不能使用
        System.out.println(arr);//数组地址[I@15db9742 哈希码
        int[]arr2=new int[19];
        System.out.println(arr2);//[I@6d06d69c
        //arr[100]=8;//数组下标越界        
        System.out.println(arr.length);
        for (int i = 0;i<arr.length;i++){
            arr[i] =(int)(Math.random()*100);
        }
        for (int i = 0; i < arr.length; i++) {//遍历输出
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

//  数组元素的默认初始化 
    //  动态初始化有默认值
        int ai[] = new int[5];
        System.out.println(ai[3]);//0
        double ad[] = new double[8];
        System.out.println(ad[5]);//0.0
        char []ch = new char[6];
        System.out.println(ch[2]);//！！！空字符
        boolean []ble = new boolean[5];
        System.out.println(ble[2]);//false
        String str[] = new String[5];
        System.out.println(str[2]);// 引用类型 null
    //  静态初始化：无默认值
        String []a1 = {};
        String []arrs = {"张三","李氏","王五"};
        System.out.println(arrs.length);
        System.out.println(arrs[2]);
        System.out.println(a1[0]);//报错java.lang.ArrayIndexOutOfBoundsException：0
        System.out.println(a1.length);//0
        System.out.println(Arrays.toString(a1));//[]
   
    }
    
}