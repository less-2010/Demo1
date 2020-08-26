package day05;

public class Car {
    private String brand;//品牌
    private String color;//颜色
    private double price;//价格
    private String carId;//车牌

    public  Car(String brand,String color,double price,String carId){
        this.brand=brand;
        this.carId=carId;
        this.color=color;
        this.price=price;
    }
    public  Car(){}

    public void  goFord(){
        System.out.println("前进");
    }
    public void  outFord(){
        System.out.println("后退");
    }

    @Override
    public String toString() {
        return
                "品牌='" + brand + '\'' +
                ", 颜色='" + color + '\'' +
                ", 价格=" + price +
                ", 车牌='" + carId + '\'' ;
    }
}
