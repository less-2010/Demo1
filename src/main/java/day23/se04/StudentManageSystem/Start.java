package day23.se04.StudentManageSystem;

import java.io.*;
import java.util.*;

/**
 * 1、登录 或 注册
 * <p>
 * # 登录
 * <p>
 * ## 登录失败 提示重新输入
 * <p>
 * ### 登陆失败超过五次十分钟内不能再登录
 * <p>
 * ## 登录成功 显示用户 属性（学员、老师、管理员）
 * <p>
 * # 注册
 * <p>
 * ## 注册成功 登录
 * <p>
 * ## 注册失败(用户名重名) 重新注册
 */
public class Start implements Serializable {
    private static final long serialVersionUID = 2077451876753816722L;
    private static final int STOP=0;

    //    private static final long serialVersionUID = 1L;
    //创建集合存储用户名称密码信息
    //学生注册集合
    Properties stu_Pro = new Properties();
    //老师注册集合
    Properties tea_Pro = new Properties();

    int key = auto_id();


    Teacher value1 = new Teacher();

    Scanner scanner = new Scanner(System.in);

    public Start() throws IOException {
        while(true) {
            homePage();
            System.err.println("是否退出程序？是请输入0,否则按任意键继续");
            if (0==scanner.nextInt()){
             break;
            }
        }
    }

    public void homePage() {
        //输出启动
        System.out.println("欢迎使用学员管理系统！");
        System.out.println("请选择注册（输入1）或者登录（输入2）");

        String idType = "学生";
        int a = scanner.nextInt();
        switch (a) {
            case 1:

                System.out.println("欢迎进入注册界面！！！");
                System.out.println("请设置用户名：");
                String useName = scanner.next();
                System.out.println("请设置用户密码：");
                String usePassword = scanner.next();
                System.out.println("请设置用户类型(学生),(老师)：");
                idType = scanner.next();

                //注册
                inPut(useName, usePassword, idType);

//                System.out.println(getStu_Pro());
//                System.out.println(getTea_Pro());
                System.out.println("注册成功!!!");

                if (idType.equals("学生")){
                    writeToXML(stu_Pro,true);
                }else{
                    writeToXML(tea_Pro,false);
                }
            case 2:

                System.out.println("欢迎进入登录界面！！！");
                System.out.println("请输入用户名：");
                String useName1 = scanner.next();
                System.out.println("请输入用户密码：");
                String usePassword1 = scanner.next();
                if (Login(useName1, usePassword1) == true) {
                    System.out.println("登录成功!!!");
                    System.out.println(">>>>>>>>>>>>>>>>>>基本功能<<<<<<<<<<<<<<<<<<<<<");}
                if (idType.equals("老师")) {
                    while(true) {
                        tea_ab();
                        System.err.println("是否退出教师端？是请输入9,否则按任意键继续");
                        if (9==scanner.nextInt()){
                            break;
                        }
                    }

                } else {

                    stu_ab();
                }

        }
    }

    public void stu_ab() {
        System.out.println(">>>>>>>>>>>>>>>>>欢迎学生登录<<<<<<<<<<<<<<<<");
        System.out.print("1(查询个人信息)");
        if (scanner.nextInt() == 1) {
            System.out.println(getStu_Pro());
        }else {
            writeToXML(stu_Pro,true);
            System.out.println("输入其他键返回启动页面");
            homePage();
        }
    }

    public void tea_ab() {
        System.out.println(">>>>>>>>>>>>>>>>>欢迎教师登录<<<<<<<<<<<<<<<<");
        System.err.print("1(查询个人信息)");
        System.err.print("                                   2(查询学生信息)");
        System.err.print("                                                           3(设置学生信息)\n");

        System.out.println("请输入选择：");
        if (scanner.nextInt() == 1) {
            System.out.println("t1.toString():" + value1.toString());
            System.out.println("getTea_Pro():" + getTea_Pro());
        } else if (scanner.nextInt() == 2) {
            System.out.println("getStu_Pro():" + getStu_Pro());
        } else if (scanner.nextInt()==3){
            System.out.println("请输入学生id：");
            String id = scanner.next();
            value1. set_stuScore(stu_Pro,id);
            //写入到文件
            writeToXML(stu_Pro,true);
        }else {
            writeToXML(tea_Pro,false);
            System.out.println("输入其他键返回启动页面");
            homePage();

        } 
    }

    /**
     *
     * @param uaeName
     * @param usePassword
     * @return Boolean
     */

    private Boolean Login(String uaeName, String usePassword) {
//        if (uaeName=)
        return true;
    }


    /**
     * 注册方法
     *
     * @param useName
     * @param usePassword
     */

    public void inPut(String useName, String usePassword, String idType) {

        if (idType.equals("学生")) {
            Student value = new Student();

            value.setStu_Id((int) key);
            value.setStu_UseName(useName);
            value.setStu_PassWord(usePassword);

            System.out.println("请输入姓名：");
            String   stu_Name = scanner.next();
            value.setStu_Name(stu_Name);

            System.out.println("请输入年龄：");
            int stu_Age = scanner.nextInt();
            value.setStu_Age(stu_Age);

            System.out.println("请输入性别：");
            String   stu_Sex = scanner.next();
            value.setStu_Sex(stu_Sex);

            stu_Pro.put(key,value.toString());
//            System.out.println(stu_Pro);
//            //存入数组
//            System.out.println("没序列化之前：Stu_pro:" + stu_Pro);
            //序列化数组写出到文件
//            writeOutInFile(stu_Pro, true);
//            writeToXML(stu_Pro,true);
        } else if (idType.equals("老师")) {
            //注册自动生成唯一ID //

            value1.setTea_Id((int) key);

            value1.setTea_UseName(useName);

            value1.setTea_PassWord(usePassword);

            value1.setTea_Name();

            value1.setTea_Age();

            value1.setTea_Sex();

            value1.setTea_Wage();
            //数据装入集合
            tea_Pro.put(key, value1.toString());

//          System.out.println(tea_Pro);

//            writeToXML(tea_Pro,false);
//          System.out.println("没序列化之前：tea_pro:" + tea_Pro);
//          writeOutInFile(tea_Pro);
        }

    }

    /**
     * @return id
     */

    private int auto_id() {
        return (int) (Math.random() * 999999 + 100000);
    }

    /**
     *
     * @param pro
     * @param student
     */

    public void writeToXML(Properties pro,Boolean student) {

        String filePath = null;
        FileOutputStream fos = null;
        if (student == true) {
            filePath = "folder\\students.xml";
        } else {
            filePath = "folder\\teachers.xml";
        }
        try {
            fos = new FileOutputStream(filePath);
            pro.storeToXML(fos, "输出propertices集合到xml", "UTF-8");
            System.out.println("写入成功：" + pro);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     *
     * @param pro
     * @param student
     */
    public void readFromXML(Properties pro,Boolean student) {
        String filePath = null;
        FileInputStream fis = null;
        if (student == true) {
            filePath = "folder\\students.xml";
        } else {
            filePath = "folder\\teachers.xml";
        }
        try {
            fis = new FileInputStream(filePath);
            pro.loadFromXML(fis);
            System.out.println("读回成功：" + pro);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    /**
     * 调用此方法会写出集到文件指定并返回stu_Pro集合
     * @return
     */

    public Properties getStu_Pro() {
        readFromXML(stu_Pro,true);
        return stu_Pro;
    }

    /**
     * 调用此方法会写出集到文件指定并返回tea_Pro集合
     * @return
     */
    public Properties getTea_Pro() {
        readFromXML(tea_Pro,false);
        return tea_Pro;
    }




    /**
     * 调用此方法会写出要保存的Properties集合信息到文件指定
     *
     * @param s
     */
    public void writeOutInFile(Properties s, boolean student) {
        String FilePath = null;
        if (student == true) {
            FilePath = "folder\\students.xml";
        } else {
            FilePath = "folder\\teachers.xml";
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FilePath, true));
        } catch (IOException e) {
            e.printStackTrace();
            try {
                oos.writeObject(s);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } finally {
                try {
                    oos.flush();
                    oos.close();
                } catch (IOException p) {
                    p.getStackTrace();
                }

            }


        }
    }

    /**
     * 获取信息方法
     *
     * @param id
     * @param idType
     */
//    @Override
    public void getInfo(String idType, int id) throws IOException {
        if (idType.equals("老师")) {
            InputStream is = new BufferedInputStream(new FileInputStream("folder\\student.xml"));
            //解决读取properties文件中产生中文乱码的问题
            BufferedReader bf = new BufferedReader(new InputStreamReader(is, "GBK"));
            ObjectInputStream ois = new ObjectInputStream(is);
            Object newObject = null;
            try {
                newObject = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            tea_Pro.load((InputStream) newObject);
            System.out.println(tea_Pro);
            //遍历集合并打印
            Set<String> keys = tea_Pro.stringPropertyNames();
            System.out.println(keys);
            is.close();
            bf.close();
        }

    }

    /**
     * 通过Id查询信息
     * @param idType
     * @param id
     * @throws IOException
     */
    public void lookInformationForId(String idType, int id) throws IOException {
        tea_Pro.load(new FileInputStream("folder\\students.xml"));
        Set<String> it = null;
        it = tea_Pro.stringPropertyNames();

        for (String key : it
        ) {
            System.out.println(tea_Pro.get(key));
            System.out.println("id是：" + key + "全部信息" + tea_Pro.getProperty(key));
        }
    }


    /**
     * @param obj
     * @return ByteArray
     * @throws Exception
     */
    public byte[] getByteArrayObject(Object obj) throws Exception {

        ByteArrayOutputStream bao = null;
        ObjectOutputStream os = null;
        bao = new ByteArrayOutputStream();
        os = new ObjectOutputStream(bao);
        os.writeObject(obj);
        return bao.toByteArray();
    }

    /**
     * @param textFilePath
     * @param bytearr
     * @throws Exception
     */
    public void writeByteArrayToFile(String textFilePath, byte[] bytearr) throws Exception {
        FileOutputStream fos = new FileOutputStream(new File(textFilePath));
        fos.write(bytearr);
    }



}
