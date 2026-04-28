package in.kgcoding.challange93;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            List <Future<Integer>>  list = new ArrayList<>() ;
            for (int i = 0; i <= 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i) ;
                list .add(service .submit(task ));
            }

            for (Future<Integer> future : list) {
                System.out.printf("Result is: %d\n" , future .get() );
            }

            service .shutdown() ;
            if(!service .awaitTermination(10 , TimeUnit.SECONDS ) ){
                System.out.println("BOHOT HUA BUS........");
                service .shutdown() ;
            }

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);

        }



    }
}
