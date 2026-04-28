package in.kgcoding.multithreading.runnable;

public class PrintTask implements Runnable {


    @Override
    public void run() {


        //print task
        for (int i = 0; i <= 500; i++) {
            System.out.printf("%d%c " , i ,targetChar );
        }
        System.out.printf("\n %s %c task complete " , Thread .currentThread() .getName() ,targetChar  );



    }

    private final char targetChar ;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }




}
