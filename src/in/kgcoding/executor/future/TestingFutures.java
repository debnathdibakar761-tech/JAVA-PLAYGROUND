package in.kgcoding.executor.future;

import java.util.concurrent.*;

public class TestingFutures {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors .newFixedThreadPool(4);
       FetchName t1 = new FetchName("Prashant") ;
       FetchName t2 = new FetchName("Sanchit");
       FetchName t3 = new FetchName("Germany") ;
       FetchName t4 = new FetchName("Berlin");

        Future <String> name1 = service .submit(t1) ;
        Future <String> name2 = service .submit(t2) ;
        Future <String> name3 = service .submit(t3) ;
        Future <String> name4 = service .submit(t4) ;

        System.out.printf("\nFull name is: %s " , name1 .get() );
        System.out.printf("\nFull name is: %s " , name2 .get() );
        System.out.printf("\nFull name is: %s " , name3 .get() );
        System.out.printf("\nFull name is: %s " , name4 .get() );

        service .shutdown() ;
    }
}
