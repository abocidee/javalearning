package heimaduoxiancehng.callable.excutorpool;

import heimaduoxiancehng.callable.MyThread;

import java.util.Date;
import java.util.concurrent.*;

public class App {

    public  static void main(String[] args){

        RunnableFuture<String> runnableFuture = new FutureTask<String>(new MyThread());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(runnableFuture);

        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程是"+Thread.currentThread().getName() +"执行时间是"+new Date().getTime()+"执行次数"+i);

        }
    }
}
