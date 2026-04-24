package in.kgcoding.inheritance;

public class InheritanceTest {

    static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle() ;
        vehicle1 .commute() ;
        System.out.println(vehicle1 .toString() );
        System.out.println(vehicle1 .hashCode());
        System.out.println(vehicle1 .getClass() );

        TwoWheeler two = new TwoWheeler() ;
        two .commute() ;
        two .balance() ;

        Motorcycle  bike = new Motorcycle() ;
        bike .commute() ;
        bike .balance() ;
        bike .start() ;

    }
}
