package com.epam.examples.module02.subjects;

import com.epam.examples.module02.subjects.pools.StudentsPool;
import com.epam.examples.module02.subjects.pools.SubjectsPool;

import java.util.HashMap;

/**
 * Created by Vsevolod on 16/03/16.
 */
public final class Subject<T extends Number> implements BaseSubject<T> {
    private final HashMap<StudentsPool, T> gradesList;
    private final SubjectsPool subjectName;

    public Subject(SubjectsPool subjectName) {
        this.subjectName = subjectName;
        this.gradesList = new HashMap<>();
    }

    @Override
    public void add(StudentsPool student, T grade) {
        gradesList.put(student, grade);
    }

    @Override
    public void find(StudentsPool student) {
        if (gradesList.get(student) != null) {
            System.out.println(subjectName.getName() + ": " + gradesList.get(student) + " point(s)");
        } else {
            System.out.println(subjectName.getName() + ": not pass");
        }
    }

    @Override
    public HashMap<StudentsPool, T> getRecord(StudentsPool student) {
        if (gradesList.get(student) != null) {
            return gradesList;
        } else {
            return null;
        }
    }
}
