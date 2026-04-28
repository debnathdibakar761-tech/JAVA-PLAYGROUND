package in.kgcoding.enums;

public enum TrafficLight {

    RED("stop") , GREEN("go") , YELLOW("caution") ;
    public final String action ;

    TrafficLight(String action) {
        this.action = action;
    }
}
