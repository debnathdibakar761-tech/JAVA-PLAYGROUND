package in.kgcoding.polymorphism;

public class TestTransportation {
      public static void main(String[] args) {
        Car c = new Car() ;
        Plane p = new Plane() ;

//          c .start() ;
//          p .start() ;


        castTest(c) ;
        castTest(p) ;




//      Vehicle vCAr = new Car() ;  comment
//



}

   private static void castTest (Vehicle veh){
            veh .start() ;


//          Car cVehicle = (Car) veh;
//          ((Car) veh) .noOfDoors() ;
//
//          cVehicle .start() ;
//          cVehicle .noOfDoors() ;


   }






    }
