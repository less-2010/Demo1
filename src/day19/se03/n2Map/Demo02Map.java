package day19.se03.n2Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo02Map {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//      entrySet();获取到Map集合中所有的键值对对象的集合（Set集合）
        Map<String, String> map = new HashMap<>();
//      put()存入
        map.put("中国", "北京");
        map.put("美国", "华盛顿");
        map.put("俄罗斯", "莫斯科");
        Set<Map.Entry<String, String>> entrySet;
        entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "首都是:" + value);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序耗时：" + (end - start) + "毫秒");
        System.out.println();
        System.out.println();
     /*   Entry是Map的一。个内部接口，我们存入Map的每-对键值对都是以它的
        实现类的对象的形式存储的。*/

//      使用Map存储自定义类型的键和值：需要重写hashCode()heequals()
        HashMap<Husband, Wife> hm = new HashMap<>();
        hm.put(new Husband("王宝强"), new Wife("马蓉"));
        hm.put(new Husband("贾乃亮"), new Wife("李小璐"));
        hm.put(new Husband("罗志祥"), new Wife("罗德拉"));

        Set<Map.Entry<Husband, Wife>> entrys = hm.entrySet();
        for (Map.Entry<Husband, Wife> entry : entrys) {
            Husband key = entry.getKey();
            Wife value = entry.getValue();
            System.out.println(key + "的妻子是:" + value);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("程序耗时：" + (end - start) + "毫秒");
        System.out.println();
        System.out.println();
//test3
        Map<Husband, Wife> hw = new HashMap<>();
        hw.put(new Husband("小明"), new Wife("小白"));
        hw.put(new Husband("xiaoming"), new Wife("小白"));
        hw.put(new Husband("王宝强"), new Wife("马蓉"));

        Set<Map.Entry<Husband, Wife>> entryss = hw.entrySet();
        for (Map.Entry<Husband, Wife> entry : entryss) {
            Husband key = entry.getKey();
            Wife value = entry.getValue();
            System.out.println(key + "的妻子是:" + value);

        }
        long end2 = System.currentTimeMillis();
        System.out.println("程序耗时：" + (end - start) + "毫秒");
        System.out.println();
        System.out.println();
        LinkedHashMap<Husband, Wife> hww = new LinkedHashMap<>();
        hww.put(new Husband("小明"), new Wife("小白"));
        hww.put(new Husband("xiaoming"), new Wife("小白"));
        hww.put(new Husband("王宝强"), new Wife("马蓉"));
        Set<Map.Entry<Husband, Wife>> entrysss = hww.entrySet();
        for (Map.Entry<Husband, Wife> entry : entrysss
        ) {
            Husband key = entry.getKey();
            Wife value = entry.getValue();
            System.out.println(key + "的妻子是:" + value);
            long end3 = System.currentTimeMillis();
            System.out.println("程序耗时：" + (end - start) + "毫秒");
        }


    }
}
