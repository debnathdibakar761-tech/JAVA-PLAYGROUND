package in.kgcoding.challange90;

public class EnumTest {

    static void main(String[] args) {
        System.out.println("printing all the days of the week");
        for (Day day : Day.values() )  {
            System.out.printf("%s : %s\n" , day , day.getType() );
        }




    }


}

