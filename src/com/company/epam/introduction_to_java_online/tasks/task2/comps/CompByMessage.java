package com.company.epam.introduction_to_java_online.tasks.task2.comps;

import com.company.epam.introduction_to_java_online.tasks.task2.Note;

import java.util.Comparator;

public class CompByMessage implements Comparator<Note> {
    @Override
    public int compare(Note o1, Note o2) {
        return o1.getMassage().compareTo(o2.getTopic());
    }
}
