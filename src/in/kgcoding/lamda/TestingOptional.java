package in.kgcoding.lamda;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,6,5,4,3,2,1);
       Optional<Integer> sum = numbers .stream()
                .reduce( (a,b) -> a+b) ;

       if (sum .isPresent() ) {
           System.out.println(sum.get() );
       }else {
           System.out.println("list is empty");
       }


    }

}
