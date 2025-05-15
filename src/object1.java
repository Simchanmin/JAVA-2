class point {
    private int x, y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point(" + x + ", " + y + ")";
    }
}

public class object1 {
    public static void main(String[] args) {
        point p = new point(2, 3);
        System.out.println(p.getClass().getName()); // 클래스 이름 출력
        System.out.println(p.hashCode());          // 해시코드 출력
        System.out.println(p.toString());          // 객체 정보 출력
    }
}