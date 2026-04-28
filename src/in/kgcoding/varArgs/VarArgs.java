package in.kgcoding.varArgs;

public class VarArgs {
   public  static void main(String[] args) {
        System.out.println(sum(4,5,4,5,4,5) );
        System.out.println(sum(2,2) );
        System.out.println(sum(5,5,5,5,5) );
    }


    public static int sum (int first, int second , int... a) {
        int sum = first + second  ;
        for (int i : a) {
            sum += i ;
        }
        return sum;
    }







}
