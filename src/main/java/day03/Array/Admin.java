package day03.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Admin {
    private static String[] names = new String[3];


    /**
     * 扩容
     */
    public static void  ArraysCopyOf(){
        if (names[names.length-1]!=null){
            names = Arrays.copyOf(names,names.length+1);
        }
    }


    /**
     * 增加
     */
    public static void addName(String name){
        for (int i = 0; i < names.length ; i++) {
            if (names[i]==null){
                names[i]=name;
                continue;//添加一次
            }
            ArraysCopyOf();
        }
    }

    /**
     * 修改
     * @param name
     */
    public static boolean updateName(String name){
        if (findName(name)) {
            for (int i = 0; i < names.length; i++) {
                if (name.equals(names[i])) {
                    names[i] = name;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (name!=null&&names[i].equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * 打印内容
     */
    public static void show(){
        for (String name:names
             ) {
            System.out.println(name);
        }
    }

}
