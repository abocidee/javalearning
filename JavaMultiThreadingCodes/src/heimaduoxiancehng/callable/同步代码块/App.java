package heimaduoxiancehng.callable.同步代码块;



public class App {
    
    public static void main(String[] args) throws  Exception{
        Ticket ticket =new Ticket();
        Thread t = new Thread(ticket);
        t.start();
        Thread t1 = new Thread(ticket);
        t1.start();
        Thread t2 = new Thread(ticket);
        t2.start();
    }
}
