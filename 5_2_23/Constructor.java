public class Constructor {
    int eid;
    String eName;
    public Constructor(int eid,String eName){
        this.eid = eid;
        this.eName = eName;
    }
    void show(){
        System.out.println(eid + eName);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(12,"Rohit");
        c.show();
    }
}
