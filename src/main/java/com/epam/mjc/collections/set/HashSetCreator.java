package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> evenSet = new HashSet<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                int tmp = num;
                evenSet.add(tmp);
                while (tmp % 2 == 0) {
                    tmp /= 2;
                    evenSet.add(tmp);
                }
            } else {
                evenSet.add(num);
                evenSet.add(2 * num);
            }
        }
        return evenSet;
    }
}
