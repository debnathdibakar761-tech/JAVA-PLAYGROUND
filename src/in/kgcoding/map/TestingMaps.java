package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {

    static void main(String[] args) {
        Map<String , Integer > map = new HashMap<>() ;
        map .put("Prashant" , 34) ;
        map .put("Sanchit" , 100) ;
        map .put("ram" , 34);
        map .put("Dev" , 0) ;


        System.out.println(map.size() );
        System.out.println(map.get("Dev") );
        System.out.println(map.get("ram") );
        System.out.println(map.containsKey("Prashant") );
        System.out.println(map.containsKey("Vijay") );
        System.out.println(map.remove("Dev") );
        System.out.println(map.size() );

        for (String key : map .keySet() ) {
            System.out.printf("%s : %S\n " , key , map.get(key) );
        }



    }



}
