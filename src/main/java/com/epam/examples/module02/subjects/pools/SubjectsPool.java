package com.epam.examples.module02.subjects.pools;

/**
 * Created by Vsevolod on 16/03/16.
 */
public enum SubjectsPool {
    RussianLanguage("Russian language"),
    Physics("Physics"),
    Biology("Biology"),
    Geometry("Geometry");

    private final String subjectName;

    private SubjectsPool(String value) {
        subjectName = value;
    }

    public String getName() {
        return subjectName;
    }
}
