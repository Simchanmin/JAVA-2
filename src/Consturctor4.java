class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // 원의 면적 계산
    }
}

class Shape {
    Circle circle; // Circle 객체를 인스턴스 변수로 포함

    public Shape(Circle circle) {
        this.circle = circle; // Circle 객체를 초기화
    }

    public void printShapeInfo() {
        System.out.println("Circle's radius: " + circle.radius);
        System.out.println("Circle's area: " + circle.calculateArea());
    }
}

public class Consturctor4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5); // 반지름 5인 Circle 객체 생성
        Shape shape = new Shape(circle); // Circle 객체를 Shape 객체로 전달
        shape.printShapeInfo(); // Shape 객체에서 Circle 정보 출력
    }
}