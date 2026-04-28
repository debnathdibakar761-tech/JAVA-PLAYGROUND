import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    static void main(String[] args) {
    List <String> list  = Arrays.asList("Amerika" , "Germany" , "Netharlands" , "Australia");
        System.out.println(list );
        sort(list) ;
        System.out.println(list);



    }

    public static void sort (List <String> stringList ){

        Collections .sort(stringList) ;
}

}
