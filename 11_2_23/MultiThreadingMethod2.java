public class MultiThreadingMethod2 extends Thread{
    public static void main(String[] args){
        MultiThreadingMethod2 a = new MultiThreadingMethod2();
        a.setPriority(MAX_PRIORITY);
        a.setName("Thread_name");
        System.out.println(a.getPriority());
        System.out.println(a.getName());
    }
}
