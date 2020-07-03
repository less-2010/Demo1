package day15.se01.homework;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 7:输出"HelloWorld"中第6个字符"W"
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		test1(str);
		test2(str);
		test3(str);
		test4(str);
		test5(str);
		test6(str);
		test7(str);
		//以下自行调用test2,test3...等方法。
	}

	private static void test7(String str) {
		System.out.println(str.charAt(5));
	}

	private static void test6(String str) {
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("ld"));
	}

	private static void test5(String str) {
		System.out.println(str.substring(5,10));
	}

	private static void test4(String str) {

		System.out.println(str.substring(str.indexOf("He"),str.indexOf("Wo")));
	}

	private static void test3(String str) {
		System.out.println(str.indexOf("or"));
	}

	private static void test2(String str) {
		System.out.println(str.indexOf("o"));
	}

	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 * @return
	 */
	public static void test1(String str){
		System.out.println(str.length());
	}



}
