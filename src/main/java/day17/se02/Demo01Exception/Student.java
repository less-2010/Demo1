package day17.se02.Demo01Exception;

import day17.se02.Demo01Exception.AgeGT150Exception;
import day17.se02.Demo01Exception.AgeLT0Exception;

public class Student {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) throws AgeLT0Exception, AgeGT150Exception {
        if(age<0){
            throw new AgeLT0Exception("年龄低于正常范围！！！");
        }else if (age>150){
            throw  new AgeGT150Exception("年龄高于正常范围！！！");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name ;
    int age;
}
