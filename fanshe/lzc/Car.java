package fanshe.lzc;

/**
 * @title: Car
 * @Author luozouchen
 * @Date: 2022/10/14 14:17
 * @Version 1.0
 */
public class Car {
    public String brand = "宝马";
    public int price = 500000;
    public String color = "白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
