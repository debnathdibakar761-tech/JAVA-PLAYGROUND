package in.kgcoding.lamda;

import java.util.List;

public class StreamTest {
    static void main(String[] args) {
        List<String> countries = List .of("America" , "Germany", "Canada", "japan" , "India" , "Australia");
        countries .stream()
                .forEach(country -> System.out.println(country )) ;

    }
}
