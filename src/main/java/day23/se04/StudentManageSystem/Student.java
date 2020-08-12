package day23.se04.StudentManageSystem;

import java.io.Serializable;
import java.util.Scanner;

/**
 * 学员有用户名、密码、学号(唯一)、姓名、年龄、性别、成绩集合
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 2077451876753816722L;
    //定义学生属性
    private String stu_UseName;
    private String stu_PassWord;
    private String stu_Name;
    private String stu_Sex;
    private int stu_Id;
    private int stu_Age;

    public String getStu_UseName() {
        return stu_UseName;
    }

    public void setStu_UseName(String stu_UseName) {
        this.stu_UseName = stu_UseName;
    }

    public String getStu_PassWord() {
        return stu_PassWord;
    }

    public void setStu_PassWord(String stu_PassWord) {
        this.stu_PassWord = stu_PassWord;
    }

    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }

    public String getStu_Sex() {
        return stu_Sex;
    }

    public void setStu_Sex(String stu_Sex) {
        this.stu_Sex = stu_Sex;
    }

    public int getStu_Id() {
        return stu_Id;
    }

    public void setStu_Id(int stu_Id) {
        this.stu_Id = stu_Id;
    }

    public int getStu_Age() {
        return stu_Age;
    }

    public void setStu_Age(int stu_Age) {
        this.stu_Age = stu_Age;
    }

    public int getStu_Score() {
        return stu_Score;
    }

    public void setStu_Score(int stu_Score) {
        this.stu_Score = stu_Score;
    }

    private int stu_Score;
    /**
     * 无参空构造
     */
    /**
     *
     */
    public Student() {
    }
//    public Student(int id) {
//        setStu_Id(id);
//    }


    public Student(String stu_UseName, String stu_PassWord, String stu_Name, String stu_Sex, int stu_Id, int stu_Age, int stu_Score) {
        this.stu_UseName = stu_UseName;
        this.stu_PassWord = stu_PassWord;
        this.stu_Name = stu_Name;
        this.stu_Sex = stu_Sex;
        this.stu_Id = stu_Id;
        this.stu_Age = stu_Age;
        this.stu_Score = stu_Score;
    }

    @Override
    public String toString() {
        return '{'+
                "stu_UseName='" + stu_UseName + '\'' +
                ", stu_PassWord='" + stu_PassWord + '\'' +
                ", stu_Name='" + stu_Name + '\'' +
                ", stu_Sex='" + stu_Sex + '\'' +
                ", stu_Id=" + stu_Id +
                ", stu_Age=" + stu_Age +
                ", stu_Score=" + stu_Score +
                '}';
    }
}
