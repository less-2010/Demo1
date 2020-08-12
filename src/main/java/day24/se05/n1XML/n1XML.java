package day24.se05.n1XML;

public class n1XML {
    public static void main(String[] args) {
        /**
         * 一、概念: Extensible Markup Language
         * 可扩展标记语言
         * 1)可扩展:标签都是自定义的。<user> <student>
         * 2)功能:存储数据。1>配置文件。2>在网络中传输。
         * 3) xm1和htm1的区别:
         * 1>xm1标签都是自定义的，html标签 是预定义的。
         * 2>xml语法严格，htm1语法松散。
         * 3>xm1是存储数据的，htm1是展示数据的。
         * 4) w3c: 万维网联盟一-xm1的技 术维护组织。
         * 二、语法:
         * 1、基本语法:
         * 1) xm1文档的后缀名: .xml
         * 2)xml第-.行必须定义为文档声明
         * 3);
         * xm1文档中有且仅有一个根标签
         * 4)属性值必须使用引号(单双都可)引起来
         * 5) 标签必须正确关闭
         * 6） xml标签名称正确区分大小写
         *
         * 2、快速入门：
         * <?xml version='1.0' ?>
         *      <users>
         *          <user id ="1">
         *              <name>张三</name>
         *              <age>20</age>
         *              <gender>female</gender>
         *          </user>
         *          <br/>
         *
         *          <user id = "2">
         *              <name>李四</name>
         *              <age>22</age>
         *              <gender>female</gender>
         *           </user>
         *          <br/>
         *      </users>
         *
         *
         * 3、组成部分:
         * 1)文档声明:
         * 1>格式: <?xml 属性列表?>
         * 2>属性列表:.version:版本号， 必须的。
         * b.encoding:编码方式。告知解析引擎当前文档使用的字符集，
         * 默认: IS0-8859-1
         * c.standalone:是否独立。yes :不依赖其他文件。n
         * no:依赖其他文件。
         * 2)指令:结合CSS的。 (对于学Java的不做要求)
         * 3)标签:标签名称自定义
         * 1>名称可以包含字母、数字以及其他的字符
         * 2>名称不能以数字或者标点符号开始
         * 3>名称不能以字母xm1 (或XML、Xml等等)|
         *4>名称不能包含空格.
         * 4)属性:id属性值唯一
         * 5)文本: CDATA区: 该区域中的数据会被原样展示
         * 格式: <![CDATA[ 数据]]>
         * 三约束:规定xm1文档的书写规则.
         * 1、作为框架的使用者(程序员)的掌握要求:
         * 1)能够在xm1中引入约束文档
         * 2)能够“简单的阅读约束文档
         * 2、分类:
         * 1) DTD:一种简单的约束技术
         * 2) Schema:一.种复杂的约束技术|
         */
    }
}
