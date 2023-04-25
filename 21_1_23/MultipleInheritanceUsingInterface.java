public interface C{
    public void m3();
}
class B{
    void m2(){
        System.out.println("B");
    }
}
public class MultipleInheritanceUsingInterface extends B implements C{
    void m1(){
        System.out.println("A");
    }
    public void m3(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface a = new MultipleInheritanceUsingInterface();
        a.m1();
        a.m2();
        a.m3();
    }
}

