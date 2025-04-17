class Example {
    static int count = 0; // 정적 변수
    static int count2 = 3; // 정적 변수
    public Example() {
        count2++;
    }
    public static void printCount() {
        System.out.println("Count: " + count); // 정적 메소드에서 정적 변수에 접근
    }
}

public class static2 {
    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();
        System.out.println("Number of objects: " + Example.count2);
        System.out.println("Count: " + Example.count); // 정적 변수에 접근
        Example.printCount();
        
    }
}