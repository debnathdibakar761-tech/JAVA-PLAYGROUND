package in.kgcoding.challange91;

public class PrintNumbers  implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("Number is %d\n", i );


        }
    }
}
