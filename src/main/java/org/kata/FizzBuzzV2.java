package org.kata;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzV2 {

    Map<Integer,String> cache = new HashMap<>();

    public String print(int i) {
        if(cache.containsKey(i)){
            return cache.get(i);
        }
        PrintedValue printedValue = new PrintedValue(i);
        cache.put(i,printedValue.toString());
        return printedValue.toString();
    }
}
