public class StaticKeyword {
    int eid;
    static String org = "Lowe";
    public StaticKeyword(int eid){
        this.eid = eid;
    }
    static void chg(){
        org = "Lowe India";
    }
    void show(){
        System.out.println(eid);
    }

    public static void main(String[] args) {
        StaticKeyword s = new StaticKeyword();
        s.show();
        chg(); // Can call static method without object
    }
    static{
        System.out.println("Static blocks run before Main");
    }
}
