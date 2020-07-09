package day20.se04.n1File;

import java.io.File;

import static day20.se04.n1File.Test.printDir;
import static day20.se04.n1File.Test.print_Dir_Filter;

public class TTest {
    public static void main (String[] args) {
        File f= new File("folder");
        f.getName();
        printDir(f); // 递归输出
        print_Dir_Filter(f);//递归+过滤器

    }
}
