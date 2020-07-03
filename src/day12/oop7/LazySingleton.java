package day12.oop7;

public class LazySingleton {
    private static LazySingleton ls = null;
    int a = (int) (Math.random()*10000000);
    private LazySingleton(){}
        public static LazySingleton getInstance() {
        if (ls==null) {
            ls=new LazySingleton();
            return ls;
        }else
            return ls;
        }
}
