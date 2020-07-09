package Day14.API;


import java.util.Date;
import java.util.Random;

/*
★、Java+分布式开发工程师课程体系
壹、JavaSE初级开发【SE】
贰、JavaEE高级开发【EE】
叁、Java分布式开发（高级和前沿技术）【分布式】
肆、云服务平台【云服务】

壹、JavaSE初级开发
〇一、逻辑基础（SE基础）
〇二、面向对象
〇三、SE进阶
〇四、网络编程
〇五、新特性
〇六、Web前端

贰、JavaEE高级开发
〇七、数据库
〇八、JavaWeb
〇九、Spring框架
一〇、SpringMVC
一一、MyBatis框架
一二、Struts2框架
一三、Hibernate框架
一四、Maven&SVN

叁、Java分布式开发（高级和前沿技术）
一五、Redis数据库
一六、Git&Git Hub
一七、Shiro安全管理
一八、RabbitMQ
一九、Docker
二〇、JavaNIO
二一、SpringCloud
二二、SpringBoot
二三、SpringData
二四、ZooKeeper
二五、分布式事务
二六、单点登录
二七、Dubbo
二八、分布式其他技术

肆、云服务平台
二九、环境部署
三十、数据库高级
三一、云服务
 */
public class Demo01 extends Random {
    /*
     ★、〇三、SE进阶总论
     1、API手册及常用类库
     2、异常处理
     3、集合
     4、File类及IO流
     5、XML&JSON
     6、多线程
     7、反射
     */
    public static void main(String[] args) {
        //三、SE进阶
//		1、API手册及常用类库
//		1-1、API手册：
//		显示——索引——类名：
//		1）包名：java.lang不需要导包，其他需要导包。
        Date d = new Date();
//		2）看类的继承结构：祖先类的方法和属性本类中不介绍
//		3）看类的基本介绍：类头、第一段第一句必看，其他酌情。
//		4）看构造方法。如何new 对象
//		5）看普通方法。能干些啥？方法名、基本介绍、参数、返回值——详细介绍
        Demo01 dd = new Demo01();
        dd.m1();

    }

    public void m1() {
        int a = this.next(16);
        System.out.println(a);
    }
}