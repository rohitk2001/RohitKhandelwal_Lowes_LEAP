interface In1 {
    public int calc(int x, int y);
}

public class Main {
    public static void main(String[] args) throws Exception {
       In1 i1 = (p,q) -> {
           return p+q*5;
        };

       System.out.println(i1.calc(1,2));

       In1 i2 = (w,d) ->{
           return w+d;
       };
       System.out.println(i2.calc(3,4));
    }
}
    
