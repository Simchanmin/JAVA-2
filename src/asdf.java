import java.util.Scanner;

public class asdf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 입력");
        String name = scanner.nextLine(); // 이름을 먼저 입력받음

        System.out.println("나이 입력");
        int age = scanner.nextInt();
        scanner.nextLine(); // 남아 있는 개행 문자 제거

        Person P1 = new Person(name, age);
        P1.Print();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
        this.name = "입력없음";
        this.age = 0;
    }

    void Print() {
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
    }
}