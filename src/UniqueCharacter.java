import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {


    static <Char> void main(String[] args) {
        Set<Character> unique  = new HashSet<>() ;
        Scanner input = new Scanner(System .in) ;
        System.out.println("Please enter your string : ");
        String userString = input .next() ;


       for (char ch : userString .toCharArray() ) {
           unique .add(ch) ;
       }
        System.out.printf("your string has %d unique characters" , unique .size() ) ;
    }


}
