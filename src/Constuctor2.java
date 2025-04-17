import java.util.Scanner;
public class Constuctor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle[] cr = new Circle[3];
        System.out.println("say radius");
        int radius = sc.nextInt();
        cr[0] = new Circle(radius);
        System.out.println("say radius");
        int radius2 = sc.nextInt();
        cr[1] = new Circle(radius2);
        System.out.println("say radius");
        int radius3 = sc.nextInt();
        cr[2] = new Circle(radius3);
        for(int i=0 ; i< cr.length ; i++){
            System.out.println(cr[i].Cir());
        }


    }
}

class Circle{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double Cir(){
        return Math.PI * radius *radius;
    }
}