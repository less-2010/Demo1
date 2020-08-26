package day03.Array;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String flag="";
        String name=null;
        System.out.println("请输入要添加的内容：");
        do {
            name = scanner.nextLine();
            Admin.addName(name);
            System.out.println("是否继续（y/n）：");
            flag = scanner.next();
        }while ("y".equals(flag));

        System.out.println("请输入要修改的内容：");
        boolean b;
            String newName = scanner.nextLine();
            b = Admin.updateName(newName);
        if(b){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }

    }
}
