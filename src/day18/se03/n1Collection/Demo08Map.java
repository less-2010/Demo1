package day18.se03.n1Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo08Map {
    public static void main(String[] args) {
    /**
     * Collection中的集合，元素都是孤立存在的，向集合中添加元素采用的是-一个
     * 一个的添加的方式。
     * Map中的集合，元素都是成对出现的，每个元素由键和值两部分组成，通过键可以
     * 找到对应的值，向集合中添加元素采用的是-一对一对的添加的方式。
     * Map中有多个子类，主要有HashMap和LinkedHashMap。
     * HashMap:存储数据采用哈希表结构，元素的存取顺序不能保持一致(无序)。
     * 由于要保证键的唯-一、不重复，需要重写充当键的类的hashCode()和equals()
     * 键和值的泛型在确定时，可以是同类型的也可以是不同类的
     */

        Map<String,String>map = new HashMap<>();
//        public V put(K key, V value);把指定的键值添加到Map集合中

        System.out.println(map.put("中国","北京"));
        map.put("美国","华盛顿");
        map.put("日本","东京");
        map.put("俄罗斯","莫斯科");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println(map);
        map.put("韩国","汉城");
        System.out.println(map.put("韩国","首尔"));
//        public V remove(Object key) 把指定的键值所对应的键值对元素集合中删除，返回被删除的元素值
        System.out.println(map.remove("日本"));
        System.out.println(map);
//        public V get(0bject key) ;根据指定的键，在集合中获取对应的值。
        System. out . println(map. get("中国"));
//        public Set<K> keySet(); 获取集合中所有的键，存储到Set集合中。一般遍历来服务
        Set<String> keys = map.keySet();
        for (String key:keys
             ) {
            System.out.println(key+":"+map.get(key));

        }

    }
}
