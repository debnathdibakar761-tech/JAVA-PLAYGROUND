package in.kgcoding.multithreading.threadclass;

public class ExtendingThreadClass {
    static void main(String[] args) {
        long startTime = System .currentTimeMillis() ;
        FirstTask t1 = new FirstTask() ;
        SecondTask t2 = new SecondTask() ;
        ThirdTask t3 = new ThirdTask() ;

        System.out.println("\n starting first Thread");
        t1.start() ;


        System.out.println("\n starting second Thread");
        t2 .start() ;


        System.out.println("\n starting third Thread");
        t3.start() ;

        long endTime = System .currentTimeMillis() ;
        System.out.printf("%s Total time taken: ", Thread .currentThread().getName(), (endTime - startTime ) );
    }

}
