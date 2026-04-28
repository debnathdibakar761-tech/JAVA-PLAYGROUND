package in.kgcoding.multithreading.synchronize;

public class UpdaterThread extends Thread  {
    private  final Counter counter ;


    public UpdaterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1500; i++) {
            counter .increment() ;
        }
    }
}
