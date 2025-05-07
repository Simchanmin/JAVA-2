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


class MyArray extends Point {
    
    MyArray(){
        
    }
}
 
public class Constructor5 {
    public static void main(String[] args) {
        MyArray ar = new MyArray();
        ar.set(3,6);
        ar.print();
    }
}