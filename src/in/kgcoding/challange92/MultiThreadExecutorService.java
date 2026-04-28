package in.kgcoding.challange92;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorService {
    static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(5)) {

            for (int i = 0; i <= 10; i++) {

                SleepTask sleepTask = new SleepTask();
                service.submit(sleepTask);

            }



            if (!service.awaitTermination(10 , TimeUnit.SECONDS )){
                System.out.println("Emergency shutdown");
                service .shutdown() ;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
