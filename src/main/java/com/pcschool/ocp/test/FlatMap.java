
package com.pcschool.ocp.test;
import java.util.Arrays;

public class FlatMap {
    public static void main(String[] args) {
        int[][] score = {
                        {100, 90, 80},
                        {70, 60, 50}
        };    
        Arrays.stream(score)
                .flatMapToInt(s ->Arrays.stream(s) );
        Arrays.stream(score)
                .flatMapToInt(Arrays::stream );  
        Arrays.stream(score)
                .flatMapToInt(s -> Intstream.of(s) );
        Arrays.stream(score)
                .flatMapToInt(Intstream::of);
        //-------------------------------------------------------------
        Arrays.stream(args)
    
    }
}
