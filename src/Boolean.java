import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(!b1);

        if(score <= 100 && score>=0){{
            System.out.println("100 이하 정수입니다.");
        }}
        else{
            System.out.println("100이상이거나 음수입니다.");
        }

    }
}
