public class VarArgs {
    static void main(String[] args) {

        System.out.println(concatenate("Prashant") );
        System.out.println(concatenate("Prashant" , "Jain") );
        System.out.println(concatenate("subscribe" , "to" , "kgCoding") );

    }

    public static String concatenate (String ...strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
         return sb.toString() ;
    }

}
