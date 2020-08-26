package day06.oop2.Demo2;

import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //对象数组
        Student []students = new Student[5];
        for (int i = 0; i < students.length ; i++) {
            students[i] =new Student();
            System.out.println("请输入第"+(i+1)+"个学生的名字：");
            String name = scanner.next().trim();
            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
            int age = scanner.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的性别：");
            String sex = scanner.next().trim();

            students[i].setName(name);
            students[i].setAge(age);
            students[i].setSex(sex);
        }

        showInfo(students);
    }
    private static void showInfo(Student[] students) {
        for (Student student:students
             ) {
            System.out.println(student.toString());
        }
    }

}
