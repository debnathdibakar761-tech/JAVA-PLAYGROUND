package in.kgcoding.polymorphism;


public class Overloading {

    Overloading (){
        System.out.println("Default constructer called");
    }

    Overloading ( String pop ){
        System.out.println(pop);

    }

    public int add (int a , int b){
        return a + b ;
    }

    public int add (int a , int b , int c , int d){
        return a + b + c + d ;
    }

    public String add (String a , String b){
        return a + b ;
    }





    static void main(String[] args) {
        Overloading overload = new Overloading() ;
        int  sum =  overload .add(3, 4) ;
        System.out.println(overload .add(5,sum ));
        System.out.println(overload .add("dibaakar" , " Punam") );

    }






}
