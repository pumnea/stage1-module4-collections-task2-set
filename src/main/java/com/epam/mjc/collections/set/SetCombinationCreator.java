package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new TreeSet<>();

        TreeSet<String> intersection = new TreeSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(thirdSet);
        result.addAll(intersection);

        for (String el : thirdSet) {
            if (!firstSet.contains(el) && !secondSet.contains(el)) {
                result.add(el);
            }
        }
        return result;
    }
}
