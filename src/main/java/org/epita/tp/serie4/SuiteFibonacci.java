package org.epita.tp.serie4;

import java.util.HashMap;
import java.util.Map;

public class SuiteFibonacci {
    private Map<Integer, Long> cache = new HashMap<>();
    public SuiteFibonacci(){
    }

    public void warming(){
        calculer(100);
    }

    public long calculer(int n) {
        System.out.println("Calculer("+n+") ...");
        if (n==0) return 0;
        if (n==1) return 1;
        if (cache.containsKey(n)) {
            System.out.println("Return Calculer("+n+") from cache.");
            return cache.get(n);
        }else{
            System.out.println("Calculer("+n+") does not exists in cache.");
            long result = calculer(n-1)+calculer(n-2);
            cache.put(n, result);
            return result;
        }
    }
}