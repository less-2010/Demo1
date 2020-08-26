package day05.oop1;

import java.util.Scanner;

public class Admin {
    String userName;
    String userPassword;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Admin(){}

    public Admin(String userName,String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return
                "用户名='" + userName + '\'' +
                ", 密码='" + userPassword + '\'';
    }

    public void upDate(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("进入登录界面：");
            System.out.println("请输入用户名：");
            String newName = scanner.nextLine().trim();
            System.out.println("请输入用户密码：");
            String newPasswd = scanner.nextLine().trim();
            if (newName.equals(admin.getUserName())&&newPasswd.equals(admin.getUserPassword())){
                System.out.println("进入设置密码界面：");
                System.out.println("请输入新密码：");
                String newPwd = scanner.nextLine().trim();
                admin.setUserPassword(newPwd);
            }else {
                System.out.println("输入的用户密码不相等！");
            }
            System.out.println("是否退出（y/n）请输入你的选择：");
            String select = scanner.nextLine().trim();
            if ("y".equals(select)){
                flag =false;
            }
        }while (flag);
    }
}
