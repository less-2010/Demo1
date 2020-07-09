package day20.se04.n1File;

import java.io.File;

public class Demo03Recursion {
    public static void main (String[] args){
        File f= new File("folder");
        printDir(f);

    }

    private static void printDir(File f) {
        //获取文件和目录
        File[] files = f.listFiles();
        //循环打印：是文件打印绝对路径，是目录打印后继续调用打印方法
        for (File file:files
             ) {
            if (file.isFile()){
                System.out.println("文件："+file.getAbsolutePath());
            }else {
                System.out.println("目录："+file.getAbsolutePath());
//                继续遍历
                printDir(file);
            }

        }
    }
}
