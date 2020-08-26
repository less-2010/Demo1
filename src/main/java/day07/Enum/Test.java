//package day07.Enum;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//import static day07.Enum.Test.Week.getWeek;
//
//
//class Test {
//    public static void main(String[] args) {
//        // week的数据类型是Week枚举类型，就约定了Week变量里面只能是Week枚举里面的七个固定变量
//        // 数据类型比常量更为严格
//        List<Week> list = new ArrayList<>();
//        for (Week week : Week.values()) {
//            list.add(week);
//        }
//        for (Week week : list) {
//            System.out.println(getWeek(week));
//        }
//    }
//
//    enum Week {
//        星期一,
//        星期二,
//        星期三,
//        星期四,
//        星期五,
//        星期六,
//        星期天;
//
//        Week() {
//        }
//
//        /**
//         * 使用枚举作为方法的参数
//         *
//         * @param week
//         * @return
//         */
//        public static String getWeek(Test.Week week) {
//            String instruct = "";
//            switch (week) {
//                case 星期一:
//                    instruct="今天星期一";
//                    break;
//                case 星期二:
//                    instruct="今天星期二";
//                    break;
//                case 星期三:
//                    instruct="今天星期三";
//                    break;
//                case 星期四:
//                    instruct="今天星期四";
//                    break;
//                case 星期五:
//                    instruct="今天星期五";
//                    break;
//                case 星期六:
//                    instruct="今天星期六";
//                    break;
//                case 星期天:
//                    instruct="今天星期天";
//                    break;
//            }
//            return instruct;
//        }
//    }
//}
//
