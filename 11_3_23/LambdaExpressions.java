@FunctionalInterface
interface AreaOfRect{
    double areaofrect(double l,double b);
}
@FunctionalInterface
interface SimpleInterest{
    double simint(double p,double r,double t);
}
@FunctionalInterface
interface AreaOfCircle{
    double areaofcircle(double radius);
}
public class LambdaExpressions {
    public static void main(String[] args) throws Exception{
         AreaOfRect i1 = (l,b)->{
             double i = l * b;
             return i;
         };
         System.out.println("Area of Rectangle:"+i1.areaofrect(2.5,10));
         SimpleInterest i2 = (p,r,t)->{
                double i = p*r*t;
                return i;
         };
         System.out.println("Simple Interest:"+i2.simint(2.5,10,10));
         AreaOfCircle i3 = (r)->{
             double i = 3.14*r*r;
             return i;
         };
         System.out.println("Area of Circle:"+i3.areaofcircle(2.5));
    }
}
