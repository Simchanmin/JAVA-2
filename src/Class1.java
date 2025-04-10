public class Class1 {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.brand = "Toyota";
        MyCar.speed = 120;
        MyCar.drive();

        Pie pie = new Pie();
        System.out.println(pie);
    }
}

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + "가 " + speed + "Km/h로 달림");
    }
}

class Pie {
    double value = 3.141592;

    public double Value() {
        return value;
    }

    @Override
    public String toString() {
        return "Pie value: " + value;
    }
}