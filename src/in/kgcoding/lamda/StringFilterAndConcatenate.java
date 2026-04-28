package in.kgcoding.lamda;

import java.util.List;

public class StringFilterAndConcatenate {
    static void main(String[] args) {
        List <String> strs = List .of("Prashant Jain " , "bad", "ghat" , "Uganda" ,  "is teaching java" , "on KG coding", "Best YouTube programming chanel") ;

      String result =  strs .stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a , b) -> a + " " + b);

        System.out.println(result );

    }
}
