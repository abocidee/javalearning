package heimaduoxiancehng.callable;

import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class App  {
    
    public static void main(String[] args) throws  Exception{
        RunnableFuture<String> task = new FutureTask<String>(new MyThread());
        
        Thread thread = new Thread(task,"my thread ");
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程是"+Thread.currentThread().getName() +"执行时间是"+new Date().getTime()+"执行次数"+i);

        }

        System.out.println(task.get());
    }
}
