package day15.se01.n3String;

public class Demo06String_replaceALl {
    public static void main(String[] args) {
        // String replaceA11(String regex, String replacement )
//        将字符串中匹配正则表达式的regex的字符串替换成replacement
        String str="你是你的谁谁谁?谁是你的你你你? ";
        String s=str .replaceAll("[谁|你]{2}", "我");
        System. out . println(s);

    }

}
