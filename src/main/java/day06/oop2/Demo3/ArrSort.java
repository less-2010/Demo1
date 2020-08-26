package day06.oop2.Demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class ArrSort {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Sort(new int[]{5,8,9,4,3},true)));
//        Scanner scanner = new Scanner(System.in);
//        String books[] = new String[]{"三国演义","水浒传","红楼梦","西游记"};
//        System.out.println("请输入你的书名：");
//        String book = scanner.next();
//        if (Contains(books,book)){
//            System.out.println("存在");
//        }else System.out.println("不存在");
//
//
    }


    public static boolean Contains(String[] books,String bookName){
        if (bookName==null||books==null) return false;
        for (String book:books
             ) {
            if (book.equals(bookName))return true;
        }
        return false;
    }

    /**
     *
     * 对数组按顺序排序
     * @param scores 分数数组
     * @param flag false
     * @return 排序后数组
     */
    public static int[] Sort(int[] scores,boolean flag){
        if(flag){
            Arrays.sort(scores);
            return scores;
        }else {
            for (int i = 0; i < scores.length-1 ; i++) {
                for (int j = scores.length-i-2;j >=0 ; j--) {
                    if (scores[j]<scores[j+1]){
                        int temp = scores[j];
                        scores[j]= scores[j+1];
                        scores[j+1] = temp;
                    }
                }
            }
        }
        return scores;
    }


}
