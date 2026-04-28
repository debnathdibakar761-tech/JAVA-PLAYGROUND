package in.kgcoding.lamda;

import java.util.List;

public class OddNumbers {
    static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,8,7,10,9) ;
        nums .stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));


    }
}
