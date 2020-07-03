package day19.se03.n2Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo03LinkedHashMap {
    public static void main(String[] args) {
    //有序
        //和HashMap不同的是，LinkedHashMap多了-条链表来维护顺序
        LinkedHashMap<Husband,Wife> hm = new LinkedHashMap<>();
        //存入
        hm.put(new Husband("王宝强"),new Wife("马蓉"));
        hm.put(new Husband("贾乃亮"),new Wife("李小璐"));
        hm.put(new Husband("罗志祥"),new Wife("罗德拉"));

        Set<Map.Entry<Husband,Wife>> entrys = hm.entrySet();
        for (Map.Entry<Husband,Wife> entry:entrys) {
            Husband key = entry.getKey();
            Wife value = entry.getValue();
            System.out.println(key + "的妻子是" + value);
        }
    }
}
