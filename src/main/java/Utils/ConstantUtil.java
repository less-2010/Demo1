package Utils;

/**
 * 在实际项目中，一般会把项目中用到的常量全部梵高一个工具类中
 *
 */
public enum  ConstantUtil {

    //静态常量
   MONDAY("星期一"),
   TUESDAY ("星期二"),
   WEDNESDAY("星期三"),
   THURSDAY ("星期四"),
   FRIDAY ("星期五"),
   SATURDAY("星期六"),
   SUNDAY("星期天");
   ConstantUtil(String s) {
      this.week = s;
   }
   public String week;
}
