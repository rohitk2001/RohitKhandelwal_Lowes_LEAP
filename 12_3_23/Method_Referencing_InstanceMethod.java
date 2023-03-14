// Reference to Instance Method

interface In1 {
    void m1();
}

public class Main {
    public void calc() {
        System.out.println("Calculating...");
    }

    public static void main(String[] args) throws Exception {

        Main m = new Main();
        In1 i1 = m::calc;
        i1.m1();
        // Referring non-static methods using anonymous object
        // Instance Method calling
        In1 i2 = new Main()::calc;
        i2.m1();
    }
}
    
