class nPoint{
    int x, y;
    public nPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
       nPoint p = (nPoint)obj;
       if(x == p.x && y == p.y) {
           return true;
    }else {
           return false;
       }
    }

}
public class nEquals {
    public static void main(String[] args) {
        point p1 = new point(2, 3);
        point p2 = new point(1, 3);
        point p3 = new point(3, 4);
        if(p1 == p2) {
            System.out.println("p1과 p2는 같다.");
        }
        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같다.");
        }
        if(p1.equals(p3)) {
            System.out.println("p1과 p3는 같다.");
        }
    }
}
