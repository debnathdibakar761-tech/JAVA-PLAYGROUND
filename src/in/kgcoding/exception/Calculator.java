package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System .in ) ;

    public static void main(String[] args) {
        a() ;

    }

    private static void a (){
        b() ;
    }

    private static void b (){
        c() ;
    }

    private static void c (){
         d();
    }

    private static void d (){

        System.out.println("welcome to Division calculator");
        System.out.println("please enter you two numbers : ");
        int first =input .nextInt() ;
        int second = input . nextInt() ;

        try {
            int [] a = new int[5] ;
//            System.out.printf("result is %d ", a[6]);
//            a[6] = first / second ;
//            System.out.printf("result is %d " , a[6]);

        } catch (ArithmeticException  exception ){
            System.out.printf("%s , enter valid value", exception .getMessage() );
        } catch (Throwable th){
            System.out.println(" General Exception.");
            throw th;
        } finally {
            System.out.println("i am in finally");
        }



    }



}
