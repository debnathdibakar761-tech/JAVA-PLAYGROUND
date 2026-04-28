package in.kgcoding.lamda;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,5,4,3,2,1);
       int sum =  nums.stream()
                .reduce(0, Integer::sum) ;


        int sum2 =  nums.stream()
                .reduce(0, (x,y) ->x + y) ;
        System.out.printf("\nsum using reduce is %d", sum2 );


        nums .stream()
                .filter(n-> n % 2 == 1)
                .forEach(System.out::println) ;


        nums .stream()
                .filter(n-> n % 2 == 1)
                .forEach(n -> System.out.println(n)) ;





    }

    }

