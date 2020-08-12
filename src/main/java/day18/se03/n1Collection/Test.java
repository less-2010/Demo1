package day18.se03.n1Collection;

public class Test {

    public static void main(String[] args) {



        Student student = new Student();
        try {
            System.out.println(student.getAge(100));
        } catch (AgeLT0Exception e) {
            e.printStackTrace();
        } catch (AgeGT150Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(student.getAge(160));
        } catch (AgeLT0Exception e) {
            e.printStackTrace();
        } catch (AgeGT150Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(student.getAge(-1));

        } catch (AgeLT0Exception e) {
            e.printStackTrace();
        } catch (AgeGT150Exception e) {
            e.printStackTrace();
        }

    }





    /*作业
    自定义一个学生类，属性有 姓名 年龄，如果用户在给学生年龄赋值时，年龄小于0抛出一个AgeLT0Exception，大于150 抛出一个AgeGT150Exception*/

}
