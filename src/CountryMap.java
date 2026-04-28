import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

    static void main(String[] args) {
        Map <String , String > countryMap = new HashMap<>() ;
        countryMap .put("Bharat" , "New Delhi");
        countryMap .put("Amerika" , "Washington Dc" ) ;
        countryMap .put("Germany" , "Berlin") ;
        countryMap .put("Netherlands" , "Amsterdam") ;
        countryMap .put("Canada" , "Vancouver") ;

        Scanner input = new Scanner (System .in) ;
        System.out.println("please enter the country name : ");
        String country = input .next() ;


        if (countryMap .containsKey(country ) ) {
            System.out.printf("Capital of %s is %s" , country , countryMap .get(country) );
        } else {
            System.out.println("sorry i dont know the capital");
        }


    }

}
