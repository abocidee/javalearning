package heimaduoxiancehng.callable.ThreadSafe;

public class Ticket implements Runnable {
    private int ticketNumber=50;
    @Override
    public void run() {
        while (true){

            try {
                if(ticketNumber>0) {
                    Thread.sleep(100);
                    System.out.println("当前线程是" + Thread.currentThread().getName() + "票数" + ticketNumber--);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
