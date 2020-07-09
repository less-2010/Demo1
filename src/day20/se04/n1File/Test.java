package day20.se04.n1File;

import java.io.File;
import java.io.FileFilter;

public class Test {

    /**
     * 用过滤器输出指定（folder）目录下的指定图片
     * @see File
     * @see FileFilter
     * @param f
     */

    public static void print_Dir_Filter(File f) {
        File[] fs  = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()) {
                    boolean b = pathname.getName().endsWith(".png") || pathname.getName().endsWith(".bmp");
                    if (b==true) {System.out.println("照片路径："+pathname.getAbsolutePath());}
                } else  {
                    print_Dir_Filter(pathname);
                }
                return false;
            }
        });

    }

    /**
     * 递归获取指定目录(folder)下的指定文件
     * @see File
     * @param f
     * @return
     */

    public static void printDir(File f) {
//      获取文件和目录
        File[] files = f.listFiles();
//      循环打印：是文件打印绝对路径，是目录打印后继续调用打印方法
        for (File file:files) {
            if (file.isFile()==true){
                if (file.getName().endsWith(".txt")){
                    System.out.println("文件名:"
                            +file.getName()+" 最后修改时间："
                            +file.lastModified()+" 分区上未分配的字节数:"
                            +file.getFreeSpace() +" 分区的大小:"
                            +file.getTotalSpace()+" 分区上的可用字节数:"
                            +file.getUsableSpace());
                }
                if (file.getName().endsWith(".bmp")|file.getName().endsWith(".png")){ System.out.println("文件："+file.getAbsolutePath());}
            }else {
//              继续遍历
                printDir(file);
            }

        }
    }


}
