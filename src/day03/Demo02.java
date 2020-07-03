package day03;

public class Demo02 {
    
    public static void main(String[] args) {
//      for循环
        for (int i = 0; i < 100; i++) {
//            1、循环变量声明并初始化:只执行一- 次
//            2、循环与否判断语句
//            3、循环变量控制语句

            System.out.println("❤"+ i);
        }
        System.out.println("输出完毕！");

//      嵌套for循环
            int a=0;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    a++;
                    System. out . println("oK:a="+a+",i="+i+",j="+5);
                }
            }

    }
}