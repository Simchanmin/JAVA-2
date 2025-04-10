class Person {
    String name;
    int age;

    // 생성자 정의
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 기본 생성자
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // 매개변수가 있는 생성자 사용
        Person person1 = new Person("Chanmin", 25);

        // 기본 생성자 사용
        Person person2 = new Person();

        person1.displayInfo();
        person2.displayInfo();
    }
}