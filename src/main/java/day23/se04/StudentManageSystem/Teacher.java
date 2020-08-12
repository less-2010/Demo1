package day23.se04.StudentManageSystem;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;


/**
 * 老师有用户名、密码、工号(唯一)、姓名、年龄、性别、薪资集合；
 * 可以查看自己的信息以及所属的学员的信息。
 */


public class Teacher implements Serializable {
    private static final long serialVersionUID = 2077451876753816722L;
    private String tea_UseName;
    private String tea_PassWord;
    private String tea_Name;
    private String tea_Sex;
    private int tea_Id;
    private int tea_Age;
    private int tea_Wage;

    @Override
    public String toString() {
        return "Teacher{" +
                "tea_UseName='" + tea_UseName + '\'' +
                ", tea_PassWord='" + tea_PassWord + '\'' +
                ", tea_Name='" + tea_Name + '\'' +
                ", tea_Sex='" + tea_Sex + '\'' +
                ", tea_Id=" + tea_Id +
                ", tea_Age=" + tea_Age +
                ", tea_Wage=" + tea_Wage +
                '}';
    }

    /**
     * teacher参数构造
     *
     * @param tea_Usename
     * @param tea_Password
     * @param tea_Name
     * @param tea_Sex
     * @param tea_Id
     * @param tea_Age
     * @param tea_Wage
     */
    public Teacher(String tea_Usename, String tea_Password, String tea_Name, String tea_Sex, int tea_Id, int tea_Age, int tea_Wage) {
        this.tea_UseName = tea_Usename;
        this.tea_PassWord = tea_Password;
        this.tea_Name = tea_Name;
        this.tea_Sex = tea_Sex;
        this.tea_Id = tea_Id;
        this.tea_Age = tea_Age;
        this.tea_Wage = tea_Wage;
    }

    /**
     * teacher无参构造
     */
    public Teacher() {
    }
    Scanner scanner = new Scanner(System.in);

    public String getTea_UseName() {
        return tea_UseName;
    }

    public void setTea_UseName(String useName) {

        this.tea_UseName = useName;
    }

    public String getTea_PassWord() {
        return tea_PassWord;
    }

    public void setTea_PassWord(String pwd) {

        this.tea_PassWord = pwd;
    }

    public String getTea_Name() {
        return tea_Name;
    }

    public void setTea_Name() {
        System.out.println("请输入姓名：");
        this.tea_Name = scanner.next();
    }

    public String getTea_Sex() {
        return tea_Sex;
    }

    public void setTea_Sex() {
        System.out.println("请输入性别：");
        this.tea_Sex = scanner.next();
    }

    public int getTea_Id() {
        return tea_Id;
    }

    public void setTea_Id(int tea_Id) {
        this.tea_Id = tea_Id;
    }

    public int getTea_Age() {
        return tea_Age;
    }

    public void setTea_Age() {
        System.out.println("请输入年龄：");
        this.tea_Age = scanner.nextInt();
    }

    public int getTea_Wage() {
        return tea_Wage;
    }

    public void setTea_Wage() {

        System.out.println("请输入月工资：");
        this.tea_Wage = scanner.nextInt();
    }

    /**
     * 通过学号查询成绩
     *
     * @param
     */
//    public void getScore() {
//        System.out.println("请输入要设置学生分数的id：");
//        int id = scanner.nextInt();
//        System.out.println(s1.getStu_Name()+" 分数：" + s1.getStu_Score());
//    }
    /**
     * 通过写入成绩
     *
     * @param
     */
    public void set_stuScore( Properties pro, String id) {

        System.out.println("请输入要设置学生的分数：");
        int score = scanner.nextInt();
//        t.setStu_Score(score);

        System.out.println(pro.getProperty(id));
        String json = pro.getProperty(id);
        System.out.println("json"+json);
//        Iterator<String>
//        .put("分数",score);
//        System.out.println(+" 分数为：");
    }



    public void objectFileInStream() throws IOException, ClassNotFoundException {

//        InputStream fis = new FileInputStream(new File("folder\\students.xml"));
        InputStreamReader isr2 = new InputStreamReader(
                new FileInputStream("folder\\students.xml"), "GBK");
//
//      读取保存对象的文件
        Object ob = isr2.read();
        System.out.println("反序列化之后:"+ob);

        isr2.close();

    }

}
