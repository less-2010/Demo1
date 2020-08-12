package day04;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        //快速排序
        int a [] = {5,6,8,9,4,3,7,1,2}; 
        QuickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    private static void QuickSort(int arr[],int low,int hight) {
        if (low>hight) {
            return;
        }
        int i = low;
        int j = hight;
        int temp = arr[low];
        while (i<j) {
            while(temp<arr[j]&&i<j){j--;}
    //      走完后arr[j]比temp小；
            while (temp>=arr[i]&&i<j) {i++;}
    //      走完后arr[i]比temp大；
            if (i<j) {
                int x  = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
        arr[low]=arr[j];
        arr[j]=temp;
        //递归调用
        QuickSort(arr, low, j-1);//左半边
        QuickSort(arr, j+1, hight);//右半边
        
    }
    
}