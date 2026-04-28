package in.kgcoding.collection;

import in.kgcoding.utils.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    static void main(String[] args) {
        List <Integer> numList = new ArrayList<>() ;
        numList .add(5) ;
        numList .add(2) ;
        numList .add(8) ;
        numList .add(-76) ;

        Collections .sort(numList) ;
        Collections .reverse(numList) ;
        Utility .print(numList) ;



        List <Integer> unmodifiable = Collections .unmodifiableList(numList) ;
        unmodifiable .add(87) ;
    }
}
