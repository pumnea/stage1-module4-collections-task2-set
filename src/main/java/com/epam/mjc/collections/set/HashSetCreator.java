package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                int current = num;

                while (current % 2 == 0) {
                    result.add(current);
                    current /= 2;
                }
                result.add(current);
            } else {
                result.add(num);
                result.add(num * 2);
            }
        }
        return result;
    }
}
