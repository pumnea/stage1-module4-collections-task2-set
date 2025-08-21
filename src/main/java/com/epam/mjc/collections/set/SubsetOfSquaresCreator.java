package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = sourceList.stream()
                .map(x -> x * x)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        return result.subSet(lowerBound, true, upperBound, true);
    }
}
