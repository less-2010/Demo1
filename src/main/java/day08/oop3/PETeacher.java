package day08.oop3;

/**
 * 体育老师类
 * @author BING
 * @date 2020/8/19 16/20
 */
public class PETeacher extends Teacher {
    String clazz;//班级
    public PETeacher(String name, int age, char sex, int weight, double wage, String clazz) {
        super(name, age, sex, weight, wage);
        this.clazz = clazz;
    }

    public PETeacher() {
        System.out.println("体育老师构造方法");
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }


}
