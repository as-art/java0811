
package com.pcschool.ocp.d11Map.d11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple","appie","banana","apple","orange","apple","papaya", "banana");
        System.out.println(items);
        
        
        
       System.out.println(
                items.stream()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
        Map<String, Long> group1 = items.stream()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println(group1);
        
    }
}
