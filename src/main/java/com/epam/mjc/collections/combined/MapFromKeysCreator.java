package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        Set<String> keys = sourceMap.keySet();
        Set<Integer> lengthSet = new HashSet<>();
        for (String s : keys) {
            lengthSet.add(s.length());
        }
        List<Integer> sortedLength = new ArrayList<>(lengthSet);
        Collections.sort(sortedLength);

        for (Integer i : sortedLength) {
            map.put(i, new HashSet<>());
            for (String s : keys) {
                if (s.length() == i) {
                    map.get(i).add(s);
                }
            }
        }
        return map;
    }
}
