package day18.se03.n1Collection.homework;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        test("qazwsxedcqazwsxqaz");
    }

    /**
     * @see Set
     * @see HashMap
     * @param string
     *
     * 计算字符串中字符出现的次数(使用Map)
     */
    private static void test(String string) {
        HashMap<Character,Integer>map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c= string.charAt(i);
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key:keys
             ) {
            System.out.println(key+":"+map.get(key)+"个");

        }
    }


}
