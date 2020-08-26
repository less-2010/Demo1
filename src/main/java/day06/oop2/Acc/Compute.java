package day06.oop2.Acc;

public class Compute {

    public static int Avg(int yuWen, int shuXue, int yingYu) {
        return (yuWen + shuXue + yingYu) / 3;
    }


    public static int[] maoPao(int[] arr) {

        int sum = 0;
        if (arr == null || arr.length == 0) {
            return null;
        }

        //排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
