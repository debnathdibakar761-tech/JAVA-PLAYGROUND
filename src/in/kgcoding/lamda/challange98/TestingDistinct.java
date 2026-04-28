package in.kgcoding.lamda.challange98;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,3,4,6,2) ;
      List<Integer > distinctnumbers = numbers  .stream()
                .distinct()
                .collect(Collectors .toList() ) ;
        System.out.println(numbers );
        System.out.println(distinctnumbers );



    }


}
