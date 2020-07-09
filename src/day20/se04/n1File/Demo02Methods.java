package day20.se04.n1File;

import java.io.File;
import java.io.IOException;

public class Demo02Methods {
    public static void main(String[] args) throws IOException {
//        1、获取功能方法
        File f1 = new File("E:\\Java202");
        File f2 = new File(f1, "也可以是文件.txt");
//        1-1、public lenght();返回由此File表示的文件长度
        System.out.println(f2.length());//注意;文件夹是没有长度的  //0
        File f3 = new File(f1, "不存在的文件.txt");
        System.out.println(f3.length());//不存在的文件也没有长度  //0
//        1-2、public String GetAbsolutePath();
//        返回File问及那绝对路径字符串
        File f4 = new File("folder");
        System.out.println(f4.getAbsolutePath());  //C:\Users\BING\IdeaProjects\Demo1\folder
//        1-3、public String getPath() ;将此File转换为路径名字符串
        System.out.println(f4.getPath());//folder
        System.out.println(f2.getPath());//E:\Java202\也可以是文件.txt
        System.out.println(f1.getPath());//E:\Java202
//        1-4、public String getName(); 返回由此File表示的文件或目录名称
        System.out.println(f4.getName());//folder
        System.out.println(f2.getName());//也可以是文件.txt
        System.out.println(f1.getName());//Java202
//        2、判断功能方法:
//        2-1、boolean exists(); 此File表示的文件或目录是否实际存在。
        System.out.println(f2.exists());//Java202
        System.out.println(f3.exists());//false
//        2-2、boolean isDirectory(); 此File表示的是否为目录
        System.out.println(f1.isDirectory());//true
        System.out.println(f2.isDirectory());//false
//        2-3、boolean isFile();此File表示的是否为文件
        System.out.println(f1.isFile());//false
        System.out.println(f2.isFile());//true

//        3、创建删除功能方法
//        3-1、public boolean createNewFile();当且仅当具有该名称的文件尚不存在时，创建-一个新的空文件。
        new File("folder\\新的文件.txt").createNewFile();
//        3-2、public boolean delete(); 删除由此File表示的文件名或目录。
        new File("folder\\新的文件.txt").delete();
//        3-3、public boolean mkdir(); 创建由此File表示的目录。
        new File("folder\\file").mkdir();
//        3-4、pulbic boolean mkdirs(); 创建由此File表示的目录，包括任何必须但不存在的父目录。
        File file = new File("folder\\FirstFloor\\SecondFloor\\newDir");
        file.mkdir();
        file.mkdirs();

//        4、目录的遍历
        System.out.println("4-1");
//        4-1、public String[] list 返回String数组， 表示设File目录中的所有子文件或目录。
        new File("folder\\文件1.txt").createNewFile();
        new File("folder\\文件2.txt").createNewFile();
        File f = new File("folder");
        String strs[] = f.list();
        for (String string : strs) {
            System.out.println(string);
        }
        System.out.println("4-2");
//        4-2、public File[] listFiles();返回一个File数组， 表示该File目录中的所有子文件或目录。
        File[] files = f.listFiles();
        for (File file2 : files) {
            System.out.println(file2.getAbsolutePath());//获取绝对路径
        }


    }
}
