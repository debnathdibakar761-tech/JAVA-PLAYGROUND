package in.kgcoding.challange83;

public class TestShapes {

    static void main(String[] args) {

     Circle circle1 = new Circle(5) ;
     Square square1 = new Square(10.3);

        System.out.printf("Area of circle is %f\n",  circle1 .calculateArea() );
        System.out.printf("Area of square is %f",  square1 .calculateArea() );

    }




}
