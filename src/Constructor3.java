class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        Circle circle = new Circle(1);
        circle.printArray(i);
    }
}