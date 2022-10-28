package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resSet = new LinkedHashSet<>(firstSet);
        resSet.removeIf(el -> !secondSet.contains(el));
        Set<String> res1Set = new HashSet<>(thirdSet);
        res1Set.removeAll(firstSet);
        res1Set.removeAll(secondSet);
        resSet.addAll(res1Set);
        return resSet;
    }
}
