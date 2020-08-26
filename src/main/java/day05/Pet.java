package day05;


public class Pet {
    String emviroment = "地球";
    String breath = "氧气";
    String sex;
    String species;
    int age;
    String name;
    String specality;
    String color;

    private static void eat() {
        System.out.println("吃东西！");
    }

    private static void cry() {
        System.out.println("狂叫呼喊！");

    }

    private static void activity() {
        System.out.println("活动");
    }

    public void Pet() {


        this.sex = (int) (Math.random() * 2) == 1 ? "男" : "女"; //随机性别
        int c = (int) (Math.random() * 4);
        switch (c) {
            case 0:
                this.color = "白";
                break;
            case 1:
                this.color = "黄";
                break;
            case 2:
                this.color = "棕";
                break;
            case 3:
                this.color = "黑";
                break;
        }
    }

}