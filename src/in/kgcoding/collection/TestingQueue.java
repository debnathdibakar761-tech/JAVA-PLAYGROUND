package in.kgcoding.collection;

import in.kgcoding.utils.Utility ;
import in.kgcoding.utils.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    static void main(String[] args) {

        Queue <Integer > queue = new LinkedList <>() ;

        queue .add(1) ;
        queue .add(2) ;
        queue .add(3) ;
        queue .offer(2) ;

        Utility.print(queue ) ;

        System.out.println("nextline here");
        System.out.println(queue .peek() );
        System.out.println(queue .element() );
        System.out.println(queue .remove() );

        System.out.println("next line started");
        Utility .print(queue ) ;

        System.out.println("next line");
        System.out.println(queue .remove() );
        Utility .print(queue );


    }
}
