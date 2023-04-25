// Reference to Instance Method

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}

public class Main {


    public static void main(String[] args) throws Exception {

        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
    
