class MyCircle {
    int radius;

    public MyCircle(int radius) { // 클래스명 변경
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // 원의 면적 계산
    }
}

class Shape {
    MyCircle circle; // 클래스명 변경

    public Shape(MyCircle circle) { // 클래스명 변경
        this.circle = circle; // MyCircle 객체를 초기화
    }

    public void printShapeInfo() {
        System.out.println("Circle's radius: " + circle.radius);
        System.out.println("Circle's area: " + circle.calculateArea());
    }
} 

public class Consturctor4 {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(5); // 클래스명 변경
        Shape shape = new Shape(circle); // MyCircle 객체를 Shape 객체로 전달
        shape.printShapeInfo(); // Shape 객체에서 MyCircle 정보 출력
    }
}