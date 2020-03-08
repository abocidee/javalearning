package heimaduoxiancehng.callable.同步方法;

public class Ticket implements Runnable {
    private int ticketNumber=50;
    private Object object = new Object();
    @Override
    public void run() {
       saleTicket();
    }
   //非静态方法相当于new 对象 静态方法相当于***.class
    public  synchronized void saleTicket(){
        while (true){

            try {

                    if (ticketNumber > 0) {
                        Thread.sleep(100);
                        System.out.println("当前线程是" + Thread.currentThread().getName() + "票数" + ticketNumber--);
                    }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
