package day01;//包声明。行末注释
public class Demo01 {
//main方法: 程序的大门
public static void main(String[] args) {
//逻辑基础:
// 1、单行注释:以双斜杠开头，本行为注释
//快捷产生单行注释: ctr+/
//2、输出语句:
System. out .println( "HelloWorld!");
//双引号引起来的内容叫字符串，原原本本输出
// syso:快捷输入的前导字母:alt+/
//练习:在控制台输出“我是程序员!”
//3、变量和常量:
//3-1变量:在内存中开辟的开一个空间，可以存放数据。在Java中声明变量，要先指明该变量存储的是哪种类型的数据。
int a=10;//数据类型变量名赋值常量- -句话结束
//=标准念法:被赋值为..........明变量并初始化
//初始化:第一-次给变量赋值。
int b;//声明变量但不初始化
b=20; //初始化
System . out. println(a);
System. out .println("a");//字符串和变量的区别
a=30;
System. out . println(a);//变量中所存的值可改变
//30=40;//报错:常量的值不能改变
//int b;//报错: 同一范围内不能声明同名变量

//int 301a;//报错:变量名不能以数字开头
//int class;//报错:变量名不能使用关键字
int B= 200;
System. out . println(B); 
System. out. println(b);
//在Java中严格区分大小写
int C;
//
//System. out . println(c);//未初始化的变量不能使用
//
//B="BBB";//往变量中只能存储声明时的数据类型。
//
// int a*;//某些特殊字符不能用来声明变量名
// int a_ 1;//常见的可用来声明变量名的特殊字符
// int a$1;
//声明变量时，尽量使用英文的见名知意
int score;//英文的见名知意
int jwfs;//不见名知意，不提倡、不可以
int 语文分数;//不推荐
//推荐驼峰命名:除了第-一个单词外，其余首字母大写
int ChineseScore;
int yourName;//驼峰命名
//如果声明的多个变量类型相同，可以一行声明
int a1,a2,a3,a4; 
}

    
}