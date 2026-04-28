package in.kgcoding.multithreading.challange92;

public class Main {
    static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState() ;
        System.out.printf("\nCreated the thread %s" , t1 .getState() );
        t1.start() ;

        t1 .join() ;

        System.out.printf("\nthread finished %s" , t1 .getState() );
    }
}
