package in.kgcoding.challange89;

public class EnumTest {
    static void main(String[] args) {
        System.out.println("printing all the days of the week");
//        System.out.println(Day .MONDAY );
//        System.out.println(Day .TUESDAY  );
//        System.out.println(Day .WEDDNESDAY );
//        System.out.println(Day .THRUSDAY  );
//        System.out.println(Day .FRIDAY  );
//        System.out.println(Day .SATURDAY );
//        System.out.println(Day .SUNDAY  );


        for (Day day : Day.values() ) {
            System.out.println(day );
        }






    }
}
