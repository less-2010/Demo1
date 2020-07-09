package day20.se04.n1File;

import java.io.File;
import java.io.FileFilter;

public class Demo04FileFilter {
    public static void main(String[] args) {
        /**
         * java.io.FileFilter是一个接口，是File的过滤器。该接口的对象可以传递
         * 给File类的listFiles(FileFilter o)作为参数，接口中只有一个方法:
         * boolean accept(File pathname); 测试pathname是否应包含在当前File目录
         * 中，符合则返回true。
         * 接口作为参数，需要传递子类的对象，重写其中的方法。这个地方我们选择
         * 匿名内部类的方式比较简单。
         * accept()方法，参数为File,表示当前File下所有的子文件和子目录。保留住
         * 则返回true,过滤掉则返回false.
         * 通过过滤器的作用，listFiles(FileFilter o)返回的数组元素都是符合条件的
         */
        File f = new File("folder");
        File[] fs = f.listFiles(new FileFilter() {// 接口传参
            @Override
            public boolean accept(File pathname) { //重写accept()
                boolean b = pathname.isFile() && pathname.getName().endsWith(".txt");
                return b;
            }
        });
        for (File file : fs
        ) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
