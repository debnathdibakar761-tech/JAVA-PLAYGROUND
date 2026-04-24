package in.kgcoding.challange82;


public class TestArray {
    static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[] {1,3,5,9} );
        ArrayOperations .statistics statistics  =opr .new statistics() ;
        System.out.println(statistics .mean() );

    }

}
