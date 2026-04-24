package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    static void main(String[] args) {
        Person person1 = new Person("Dev" , 26 , "001a") ;
        Person person2 = new Person("Dev" , 26 , "001a") ;

//        if (person1 == person2 ){
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }
// ___________________________________________________________
        if (person1 .equals(person2 )){
           System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
