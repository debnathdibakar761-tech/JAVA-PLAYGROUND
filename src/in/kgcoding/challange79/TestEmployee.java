package in.kgcoding.challange79;

 class TestEmployee {
     static void main(String[] args) {
         Employee emp = new Employee("Dev" , 27 , 125000) ;
         System.out.println(emp .getEmployeeDetails() );
         emp .setName("Dev kumar") ;
         System.out.println(emp .getEmployeeDetails() );
     }
}
