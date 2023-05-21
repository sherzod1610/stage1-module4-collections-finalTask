package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() < o2.length())
                return 1;
            if (o1.length() == o2.length())
                return o2.compareTo(o1);
            return -1;
        };
        List<String> list = new ArrayList<>();
        Set<String> set = projects.keySet();
        for (String s : set) {
            if (projects.get(s).contains(developer)) {
                list.add(s);
            }
        }
        list.sort(comparator);
        return list;
    }
}
