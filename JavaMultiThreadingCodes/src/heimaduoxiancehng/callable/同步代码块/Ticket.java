package heimaduoxiancehng.callable.同步代码块;

public class Ticket implements Runnable {
    private int ticketNumber=50;
    private Object object = new Object();
    @Override
    public void run() {
        while (true){

            try {
                synchronized (object) {
                    if (ticketNumber > 0) {
                        Thread.sleep(100);
                        System.out.println("当前线程是" + Thread.currentThread().getName() + "票数" + ticketNumber--);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
