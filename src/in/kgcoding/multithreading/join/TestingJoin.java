package in.kgcoding.multithreading.join;

import in.kgcoding.multithreading.runnable.PrintTask;

public class TestingJoin {


    static void main(String[] args) throws InterruptedException {
        PrintTask P1 = new PrintTask('*') ;
        PrintTask P2 = new PrintTask('$') ;
        PrintTask P3 = new PrintTask('#') ;


        Thread T1 = new Thread(P1) ;
        T1.start() ;
        System.out.println("\nThread 1 started");

        Thread T2 = new Thread(P2) ;
        T2.start() ;
        System.out.println("\nThread 2 started");
        T1.join() ;


        Thread T3 = new Thread(P3) ;
        System.out.println("\nThread 3 started");
        T3.start() ;
    }
}
