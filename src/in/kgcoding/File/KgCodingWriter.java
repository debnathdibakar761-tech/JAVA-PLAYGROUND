package in.kgcoding.File;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    static void main(String[] args) {
        String filename = "JAVA-course.txt";


        try ( FileWriter writer = new FileWriter(filename);){
            writer .write("This is the best JAVA course") ;
            for (int i = 0 ; i < 100 ; i++){
                writer .write("Germany /n") ;
            }
            writer .flush() ;
            System.out.println("file written successfully again");

        } catch (IOException exception ){
            System.out.printf("Exception occurred %s ", exception.getMessage() );
        }


    }





}
