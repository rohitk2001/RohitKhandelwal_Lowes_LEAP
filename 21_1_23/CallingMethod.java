public class CallingMethod {
    void m1(){
        System.out.println("Calling method");
    }
    public static void main(String[] args) {
        CallingMethod c = new CallingMethod();
        c.m1();
    }
}
