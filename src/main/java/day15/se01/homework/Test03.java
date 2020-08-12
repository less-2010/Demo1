package day15.se01.homework;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println(check("上海自来水来自海上"));
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str) {
		int s = str.length();
		for (int i = 0; i < s; i+=1) {
			if(str.charAt(i)!=str.charAt(s-i-1)){
				return false;
			}
		} return true;
	}
}
