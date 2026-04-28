package in.kgcoding.collection;

import java.lang.classfile.attribute.LineNumberTableAttribute;
import java.util.ArrayList;
import java.util.List;

public class TestingList {


    static void main(String[] args) {

        List <String> strList = new ArrayList<>() ;

        strList .add("Prashant") ;
        strList .add("Jain") ;
        strList .add(1 , "Praddep") ;
        strList .remove(0) ;
        strList .set(0 , "Dibaakar") ;

        System.out.println(strList .size() );
        System.out.println(strList .contains("Dibaakar") );
        System.out.println(strList .contains("Dev") );
        System.out.println(strList .indexOf("Dibaakar") );

        for (int i = 0 ; i < strList .size() ; i++){
            System.out.println(strList .get(i) );
        }

        System.out.println("next");


        for ( String str: strList ){
            System.out.println(str );
        }

    }
}
