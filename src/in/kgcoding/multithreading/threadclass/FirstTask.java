package in.kgcoding.multithreading.threadclass;

public class FirstTask extends Thread {

    @Override
    public void run() {

        //first task
        for (int i = 0; i <= 500; i++) {
            System.out.printf("%d* " , i);
        }
        System.out.printf("\n %s * task complete " , Thread .currentThread() .getName() );

    }


}
