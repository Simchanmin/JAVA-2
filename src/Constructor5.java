class Point{
    int x, y;

    void set (int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println(x*y);
    }
}


class Array extends Point {
    
    Array(){
        
    }
}
 
public class Constructor5 {
    public static void main(String[] args) {
        Array ar = new Array();
        ar.set(3,6);
        ar.print();
    }
}