package in.kgcoding.lamda.challange95;

public class TestingFunctionalInterface {
    static void main(String[] args) {
        Candidate candidate = num -> {
            for (int i = 2; i < num ; i++) {
                if (num % i == 0){
                    return false ;
                }
            }
            return true ;
        };

        System.out.println(candidate .isCandidate(5) );
        System.out.println(candidate .isCandidate(12) );

















    }
}
