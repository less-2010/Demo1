package day21.se04.n3CharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03HandleException {
//    handle1();
//    用JDK7优化后的try-with-resource语句，该语句
//    确保了每个资源在语句结束时关闭。所谓的资源
//    (resource) 是指在程序完成后，必须关闭的对象。
        //创建流对象
        FileWriter fw;
    {
        try {
            fw = new FileWriter("fw. txt");
            //写出数据
            fw.write("中兴程序员"); //中兴程序员
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("捕捉异常了");
        } finally {
            handle();
        }
    }
    private void handle() {
        if (fw != null) {
            try {
                fw.close();
                System.out.println("关流了! ");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
