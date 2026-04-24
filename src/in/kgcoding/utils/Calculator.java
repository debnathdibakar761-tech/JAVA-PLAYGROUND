package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle Cir = new Circle(5.5) ;
        Rectangle rect = new Rectangle (10 , 5);

        double  cirArea = Math.PI * Math.pow(Cir.radius , 2) ;
        double  rectArea = rect.breadth * rect.length ;

        System.out.printf("Area of the circle is :  %f , Area of the rectangle is : %f" , cirArea ,rectArea);



    }


}
