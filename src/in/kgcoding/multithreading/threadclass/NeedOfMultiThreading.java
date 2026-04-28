package in.kgcoding.multithreading.threadclass;

public class NeedOfMultiThreading {

    static void main(String[] args) {

        long startTime = System .currentTimeMillis() ;
        System.out.println(startTime );

        for (int i = 0; i <= 500; i++) {
            System.out.printf("%d* " , i);
        }
        System.out.println("\n* task complete ");



        for (int i = 0; i <= 500; i++) {
            System.out.printf("%d$ " , i);
        }
        System.out.println("\n$ task complete ");



        for (int i = 0; i <= 500; i++) {
            System.out.printf("%d# " , i);
        }
        System.out.println("\n# task complete ");

        long endTime = System .currentTimeMillis() ;
        System.out.printf("Total time taken: %d" , (endTime - startTime ));

    }





}
