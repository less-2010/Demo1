package day15.se01.n3String;

public class Demo04String_Matchs {
    /**
     * 字符串支持正则表达式的方法之-一:
     * boolean matches (String regex)
     * 使用给定的正则表达式验证当前字符串是否满足其格式要求，
     * 满足则返回true,不满足则返回false。
     * 需要注意:
     * 在Java中，给定的字符串无论是否添加了边界匹配，都是做全匹配验证，
     * 所以在这里给顶的正则表达式可以不添加^$这两个字符。
     *
     * 正则表达式是一串特定的字符，组成一个“规则字符串”,
     * 这个规则字符串是描述文本规则的工具。正则表达式就是记录
     * 文本规则的代码。|
     */


    public static void main(String[] args) {

//      #### [abc]：a、b、c中的任意字符
        System.out.println("a".matches("[abc]"));//true
        System.out.println("b".matches("[ac]"));//false
//      #### [^abc]:除了abc中的任意字符
        System.out.println("中".matches("[abc]"));//true
//      #### [a-z]:表示abcd......z中的任意字符
        System.out.println("s".matches("[a-z]"));//true
//      #### [a-zA-Z0-9]:表示a~z、A~Z、0~9的任意字符
        System.out.println("asc2As6".matches("[a-zA-Z0-9]"));//
//      #### [a-z&&[^bc]]:表示a~z中除了bc的任意字符  &&表示“与”
        System.out.println("b".matches("[a-z&&[^bc]]"));//
//      #### .:任意一个字符
        System. out . println("哈" .matches("."));
//      #### \d:任意- 一个数字字符，相当于[0-9]
        System . out . println( "9" . matches("\\d"));//需要转义
//      #### \D：非数字字符
        System.out.println("a".matches("\\D"));
//      #### \w:单词字符，相当于: [a-zA-Z0-9_ ]
        System.out . println("_ " . matches ("\\W"));
//      #### \W:非单词字符
        System.out.println("$".matches("\\W"));

//      #### \s: 空白字符，相当于[\t\n\x0B\f\r]
        System. out. println("\n" . matches("\\s")) ;
//      #### X?:表示0个或任意多个X

//      #### X*:表示0个或任意多个X
        System . out . println("aaaa" .matches("a*"));
//      ####  X+:表示1个到任意多个x
        System. out.println("".matches("a+"));
//      #### X{n}:表示n个X
        System. out.println("aa".matches("a{2}"));
//      ####  X{n,m}:表示n个到m个X
        System. out . println("aaa" . matches("a{2,8}"));
//      #### 练习:任意6个数字
        System . out. println("123456" .matches ("\\d{6}"));
//        分组: "()"表示可以将一系 列表达式看做一一个整体，分组时可以使用“”表示“或”的关系。
//        例如:表示匹配手机号码前面的区号: +86 或0086开头(若非跨国呼叫则免)，0或1个的空白字符后，跟11位数字
        System . out. println("+86 1888888888".matches ("(\\+86|0086)?\\s?\\d{11}" ));

    }
}
