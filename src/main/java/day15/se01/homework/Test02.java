package day15.se01.homework;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"
 * 并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("大家好！");
		test1(str);
		test2(str);
		test3(str);
		test4(str);
	}

	private static void test4(StringBuilder str) {
		System.out.println(str.delete(0,4));
	}

	private static void test3(StringBuilder str) {
		System.out.println(str.replace(6,8,"牛牛"));
	}

	private static void test2(StringBuilder str) {

		System.out.println(str.insert(6,"优秀的"));
	}

	public static void test1(StringBuilder str) {
		System.out.println(str.insert(4,"我是程序员!"));
	}
}
