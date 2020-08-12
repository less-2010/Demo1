package day03;

import java.util.Scanner;

public class ArrayTowTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*二维数组 赋值 */
        int score [][] = new int[3][4];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("给"+(i+1)+"行"+(j+1)+"列"+"赋值：");
                score[i][j]= scanner.nextInt();
            }
        }
        /*遍历*/
        for (int i = 0; i < score.length; i++) {
            for (int s = 0; s <score[i].length ; s++) {
                System.out.print(score[i][s]+"\t");
            }System.out.println();
        }
    }
}



class towArrayTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score [][] = new int[3][4];
        int noJg=0;//不及格人数
        //遍历班级
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            //遍历人数
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("给"+(i+1)+"班第"+(j+1)+"个学生"+"赋值：");
                score[i][j]= scanner.nextInt();
                if (score[i][j]<60){
                    noJg++;
                }
                sum+=score[i][j];
                System.out.println("score[i].length:"+score[i].length);
            }
            System.out.println("score.length:"+score.length);
            System.out.println("第一个班的平均分："+(sum/4));
        }
        System.out.println("不及格人数为："+noJg);


        /**
         * 二维矩阵形式输出
         */
        for (int i = 0; i < score.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            for (int s = 0; s <score[i].length ; s++) {
                if (s==0){
                    System.out.print("[");
                }
                System.out.print(score[i][s]);
                if (s<score[i].length-1){
                    System.out.print(",");
                }
                if (s==score[i].length-1){
                    System.out.print("]");
                }
            }
            if(i== (score.length-1))
                System.out.print("]");
            System.out.println();
        }
    }
}

class TowFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        String select = "y";
        int j=0;
        while (select=="y") {
            j++;
            for (int i = 0; i < 6; i++) {
                System.out.println("欢迎光临第" + j + "家专卖店");
                System.out.println("是否要离开？(y/n)");
                String input = scanner.next().trim();
                if (select.equals(input)) {
                    continue;
                } else {
                    count += 1;
                    System.out.println("买了一件衣服");
                }
            }
        }
    }
}

class Array{
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int count=0;
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第"+i+"个人所购第"+j+"件商品的价格：");
                double input = scan.nextDouble();
                if (input>300){
                    count+=1;
                    sum++;
//                    System.out.println(count);
                    System.out.println("请输入第"+i+"个人所购商品有"+count+"能打折");
                }
            }
        }
    }
}


class towForTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
           int row =scanner.nextInt();
        for (int i = 0; i < row+1 ; i++) {
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class towForTest1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row =scanner.nextInt();
        for (int i = 0; i <= row ; i++) {
            //控制空格
            for (int j = 0; j <row-i; j++) {
                System.out.print("#");
            }
            //控制输出*
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            //控制换行
            System.out.println();
        }
    }
}

class NumTable{
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            int acc=0;
            for (int j = 1; j <10 ; j++) {
                if (i<j){
                    continue;
                }
                acc = i*j;
                System.out.print(i+"*"+j+"="+acc+"\t");
            }
            System.out.println();
        }
    }
}
