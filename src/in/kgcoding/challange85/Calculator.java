package in.kgcoding.challange85;

public class Calculator {

    public int add (int a , int b){
        return a + b ;
    }

    public int add (int a , int b , int c) {
        return a + b + c ;
    }

    public double add (double a , double b){
        return a + b ;
    }


    static void main(String[] args) {
        Calculator calC = new Calculator() ;

        System.out.println(calC .add(2,3) );
        System.out.println(calC .add(2,2,2) );
        System.out.println(calC .add(22.22 , 2.22) );
    }

}
