package in.kgcoding.collection;

import in.kgcoding.utils.Utility;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {

    static void main(String[] args) {
        Set <String> names = new HashSet<>() ; {
            System.out.println(names .add("Dibaakar") );
            System.out.println(names .add("Dev") );
            System.out.println(names .add("Vijay") );

            Utility .print(names) ;
            System.out.println(names .add("Vijay") );
            System.out.println(names .size() );
            System.out.println(names .contains("Dev") );
            System.out.println(names .remove("Dev") );
            System.out.println(names .size() );
            Utility .print(names ) ;



        }
    }





}
