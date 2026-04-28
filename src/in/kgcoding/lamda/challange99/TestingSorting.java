package in.kgcoding.lamda.challange99;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee("Prashant", 1005),
                new Employee("Prashant", 5100),
                new Employee("Sanchit", 1200),
                new Employee("ram", 1500),
                new Employee("shayam", 2),
                new Employee("Mohan", -1)
        );

          employees .stream()
                  .sorted((emp1 , emp2) -> emp1 .getSalary() - emp2 .getSalary() )
                  .forEach(System .out ::println ) ;


    }

}
