public class Class1 {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.brand = "Toyota";
        MyCar.speed = 120;
        MyCar.drive();

    }
}
class Car{
    String brand;
    int speed;

    void drive(){
        System.out.println(brand + "가" + speed + "Km/h로 달림");
    }
}


