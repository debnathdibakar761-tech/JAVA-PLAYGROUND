package in.kgcoding.multithreading.challange94;

public class Road {
    static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor .RED ) ;
        TrafficLightThread green = new TrafficLightThread(TrafficColor .GREEN ) ;
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor .YELLOW );

        green .start() ;
        green .join() ;

        yellow .start() ;
        yellow .join() ;

        red .start() ;




    }
}
