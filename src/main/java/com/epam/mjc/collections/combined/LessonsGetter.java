package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        Collection<List<String>> values = timetable.values();
        for (List<String> l : values) {
            lessons.addAll(l);
        }
        return lessons;
    }
}
