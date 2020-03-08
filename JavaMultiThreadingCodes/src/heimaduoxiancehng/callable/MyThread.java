package heimaduoxiancehng.callable;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyThread  implements Callable<String> {
    @Override
    public String call() throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程是"+Thread.currentThread().getName() +"执行时间是"+new Date().getTime()+"执行次数"+i);

        }
        return "hello";
    }
}
