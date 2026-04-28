package in.kgcoding.multithreading.chalange91;

public class Main {
    static void main(String[] args) {
        HelooThread t1 = new HelooThread(1) ;
        HelooThread t2 = new HelooThread(2) ;

        t1.start() ;
        t2 .start() ;


    }
}
