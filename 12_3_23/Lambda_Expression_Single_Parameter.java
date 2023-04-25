interface In1 {
    public String show(String eName);
}

public class Main {
    public static void main(String[] args) throws Exception {
        In1 i1 = eName -> {
            return "Hi... " + eName;
        };

        System.out.println(i1.show("VEERA"));

        In1 i2 = eName -> {
            return "Welcome... " + eName;
        };

        System.out.println(i2.show("ROHIT"));

    }
}
    
