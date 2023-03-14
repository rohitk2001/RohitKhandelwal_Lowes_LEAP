import java.io.*;
import java.util.*;
//Similar to ArrayList but supports duplciates also.
public class Vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("j");
        v.add("p");
        v.add("a");
        v.add("r");
        v.add("j");
        v.add(3,"sql"); // add element in particular positon
        v.setElementAt("p",5); // same as above
        v.size(); //size of vector
        v.capacity(); //by default initial capacity of vector is 4
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        if(v.contains("p")){
            System.out.println(v.indexOf("p"));
        }
        v.firstElement();
        v.lastElement();
        v.remove(5); // removes element at 6th positon
    }
}
