public class abt {
    public static void main(String[] args) {
        foo2 f = new bar();
        System.out.println(f.add(2, 3));


    }
        
}
abstract class foo2{
    public abstract int add(int a, int b);
}

class bar extends foo2{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}