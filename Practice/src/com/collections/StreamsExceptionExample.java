package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 /**
 * Write Program to - - in java 8
 */
public class StreamsExceptionExample {
 public static void main(String[] args) {
 //Stream<Integer> stream = Stream.of(1,2,3,4);
          List<String> StringList = new ArrayList<>();
           StringList.add("ank");
           // Convert list (ArrayList) to stream
           Stream<String> stream = StringList.stream();
                        // Now, use stream
           stream.forEach(System.out::println); // Displays  - ank, az, ad
 
 
           /**
            * UNCOMMENT this line to avoid - java.lang.IllegalStateException: stream has already been operated upon or closed
            */
           //stream = StringList.stream(); // Convert list (ArrayList) to stream
 
           
           //Below will throw - Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
           //Exception could be avoided if above line is uncommented
           stream.forEach(System.out::println);
 
         }
 
}
