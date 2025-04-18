class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    
    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 업캐스팅
        Dog dog = (Dog) animal; // 다운캐스팅
        dog.sound(); // "Dog barks" 출력 (자식 클래스의 메서드 호출)
        dog.fetch(); // 컴파일 오류: Animal 클래스에는 fetch() 메서드가 없음
    }
}