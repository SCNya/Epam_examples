package com.epam.examples.module02.subjects;

import com.epam.examples.module02.subjects.pools.StudentsPool;

import java.util.HashMap;

/**
 * Created by Vsevolod on 16/03/16.
 */
public interface BaseSubject <E extends Number> {

    void add(StudentsPool student, E grade);

    void find(StudentsPool student);

    HashMap<StudentsPool, E> getRecord(StudentsPool student);
}
