package day07.Enum;

/**
 * 枚举里面可以实现序列，成员变量 ，普通方法，构造方法
 * 自定义枚举类可以看作一个类，继承于java.lang.Enum类
 *
 * @author BING
 */
public enum Week {

    // 实现序列
    MONDAY("星期一",1),
    TUESDAY("星期二",2),
    WEDNESDAY("星期三",3),
    THURSDAY("星期四",4),
    FRIDAY("星期五",5),
    SATURDAY("星期六",6),
    SUNDAY("星期天",7);

    private String name;
    private int Num;
    //空参构造
    Week() {
    }
    //有参构造
    private Week(String name, int Num){
        this.name = name;
        this.Num = Num;
    }

    /**
     * 遍历枚举取值
     * @param name
     * @return
     */
    public static String getName(String name){
        for (Week w:Week.values()
             ) {
            if (name.equals(w.name)){
                return w.name;
            }
        }
        return null;
    }

    /**
     *
     * @param num
     * @return
     */
    public static int getNumber(int num){
        for (Week w:Week.values()
             ) {
            if (num==w.Num){
                return w.Num;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
