class C {
    void m3(){
        System.out.println("C");
    }
}
class B extends C{
    void m2(){
        System.out.println("B");
    }
}
public class MultiLevelInheritance extends B {
    void m1(){
        System.out.println("A");
    }
    public static void main(String[] args) {
        MultiLevelInheritance a = new MultiLevelInheritance();
        a.m1();
        a.m2();
        a.m3();
    }
}
