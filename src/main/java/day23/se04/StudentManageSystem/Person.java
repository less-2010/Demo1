package day23.se04.StudentManageSystem;


import java.io.FileNotFoundException;
import java.io.IOException;

public interface Person<T> {

    //创建集合存储用户名称密码信息
    /**
     * 注册方法
     * @param useName
     * @param usePassword
     */
    public void inPut(String useName,String usePassword,String idType) throws IOException;
    /**
     * 获取信息方法
      */
    public  void getInfo(T useName,T userPassword,T idType) throws IOException, ClassNotFoundException;

}
