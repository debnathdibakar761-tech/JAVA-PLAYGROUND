package in.kgcoding.multithreading.synchronize;

import java.security.PrivateKey;

public class Counter {
    private int count = 1 ;

   public synchronized  void increment () {
       count ++;
   }
    public int getCount (){
       return count ;
    }

}

