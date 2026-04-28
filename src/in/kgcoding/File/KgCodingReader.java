package in.kgcoding.File;

import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    static void main(String[] args) {
        String filename = "JAVA-course.txt";

        try (FileReader reader = new FileReader(filename)) {

            int  read = 0 ;
            do {
                read = reader .read() ;
                System.out.print((char)  read );
            } while (read != -1);



        } catch (IOException e) {
            System.out.printf("Exception occurred : %s " , e.getMessage() );
        }


    }


}