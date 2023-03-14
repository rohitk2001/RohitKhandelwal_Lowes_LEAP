class Deploy{
    synchronized void app(int duration){
        for(int i=0;i<=5;i++){
            System.out.println(i*duration);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
};
class Client1 extends Thread{
    Deploy d;
    public void Client1(Deploy d){
        this.d = d;
    }
    @Override
    public void run(){
        d.app(5);
    }
};
class Client2 extends Thread{
    Deploy d;
    public void Client2(Deploy d){
        this.d = d;
    }
    @Override
    public void run(){
        d.app(10);
    }
};
public class SynchronizedMethod {
    public static void main(String[] args) {
        Deploy d = new Deploy();
        Client c1 = new Client1(d);
        Client c2 = new Client2(d);
        c1.start();
        c2.start();
    }
}
/*
5 10 10 20 15 30 20 40 25 50 : without synchronized
5 10 15 20 25 10 20 30 40 50 : with synchronized
 */
