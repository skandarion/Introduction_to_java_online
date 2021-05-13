package com.company.epam.introduction_to_java_online.tasks_6.task2.comps;

import com.company.epam.introduction_to_java_online.tasks_6.task2.Note;

import java.util.Comparator;

public class CompByEmail implements Comparator<Note> {
    @Override
    public int compare(Note o1, Note o2) {
        return o1.geteMail().compareTo(o2.geteMail());
    }
}
