import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<String> s = new HashSet<>();
        s.add("python");
        s.add("java");
        s.add("kotlin");
        s.add("c++");
        s.add("javascript");

        s.forEach((n)->System.out.println(n));
    }
}
    
