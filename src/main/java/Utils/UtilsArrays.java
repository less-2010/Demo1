package Utils;

import java.util.Arrays;

/**
 * 数组工具类
 * @author BING
 * @date 2020/8/20
 */
public class UtilsArrays {

    /**
     *
     * 对数组按顺序排序
     * @param scores 分数数组
     * @param flag false 逆序 true 顺序
     * @return 排序后数组
     */
    public static int[] sort(int[] scores,boolean flag){

        if(flag==true){
            Arrays.sort(scores);
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