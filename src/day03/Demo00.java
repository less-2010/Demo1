package day03;
/**
 while 循环


 // 1，System.exit(int status)：不管status为何值都会退出程序（即结束当前正在运行的java虚拟机），但是只有在status等于0，即System.exit(0)；的时候整个程序正常退出。当status为除0之外的数字时都视为程序的不正常退出。（示例在一个if-else判断中，如果我们程序是按照我们预想的执行，到最后我们需要停止程序，那就使用System.exit(0)，而System.exit(1)一般放在catch块中，当捕获到异常，需要停止程序，我们使用System.exit(1)。）

// 2、return：return；是只能直接回到上一层继续往下执行，不会直接导致整个程序的停止执行。

// 3、break：break；只在switch语句体和循环体应用，一个break；语句能退出一个switch语句体或循环体，不会执行循环体或switch语句体余下的语句，不能连续退出多个switch语句体或循环体。

// 4、continue：自己目前只在循环体应用。
// continue；跳过本次循环体中余下尚未执行的语句，接着再一次进行循环的条件判定是否执行。
 */
public class Demo00 {
    public static void main(String[] args) {
        int num = 0;
        while(true){
            System.out.println("❤我的小鱼❤\n"+"❤你醒了❤\n"+"❤还认识早晨吗❤\n"+"❤昨夜你曾经说❤\n"+num);
            num++;
            if(num>100)break;
        }
        System.out.println("输出完毕");

        
    }
    
}