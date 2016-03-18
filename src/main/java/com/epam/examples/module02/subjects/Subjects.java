package com.epam.examples.module02.subjects;

import com.epam.examples.module02.subjects.pools.StudentsPool;
import com.epam.examples.module02.subjects.pools.SubjectsPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/**
 * Created by Vsevolod on 16/03/16.
 */
public class Subjects {
    private final ArrayList<BaseSubject> subject;
    private ListIterator<BaseSubject> it;

    public Subjects() {
        this.subject = new ArrayList<BaseSubject>();
    }

    public void fill() {
        //Create Russian language subject
        BaseSubject<Integer> ruLang = new Subject<>(SubjectsPool.RussianLanguage);
        ruLang.add(StudentsPool.LillyWachowski, 4);
        ruLang.add(StudentsPool.AlexVoll, 5);
        subject.add(ruLang);

        //Create Physics subject
        BaseSubject<Double> physics = new Subject<>(SubjectsPool.Physics);
        physics.add(StudentsPool.AlexVoll, 8.0);
        physics.add(StudentsPool.AlexBrin, 9.0);
        subject.add(physics);

        //Create Biology subject
        BaseSubject<Integer> biology = new Subject<>(SubjectsPool.Biology);
        biology.add(StudentsPool.AlexBrin, 5);
        biology.add(StudentsPool.LillyWachowski, 5);
        biology.add(StudentsPool.AlexVoll, 4);
        subject.add(biology);

        //Create Geometry subject
        BaseSubject<Double> geometry = new Subject<>(SubjectsPool.Geometry);
        geometry.add(StudentsPool.AlexBrin, 7.0);
        geometry.add(StudentsPool.AlexVoll, 7.0);
        subject.add(geometry);
    }

    public void find(StudentsPool student) {
        System.out.println("\n\t" + student.getName() + '\n');

        HashMap<StudentsPool, Number> maxGradeRecord;

        it = subject.listIterator();
        if (it.hasNext()) {
            BaseSubject itBaseSubject = null;
            maxGradeRecord = null;

            while (it.hasNext()) {
                itBaseSubject = it.next();

                itBaseSubject.find(student);

                maxGradeRecord = getMaxRecord(student, maxGradeRecord, itBaseSubject);
            }
            if (maxGradeRecord != null) {
                System.out.println("\tMax point = " + maxGradeRecord.get(student));
            } else {
                System.out.printf("\t(!) Student not found\n");
            }
        } else {
            System.out.printf("No records\n");
        }
    }

    private HashMap<StudentsPool, Number> getMaxRecord(StudentsPool student, HashMap<StudentsPool, Number> maxGradeRecord, BaseSubject itBaseSubject) {
        if (maxGradeRecord == null)
            maxGradeRecord = itBaseSubject.getRecord(student);

        if (itBaseSubject.getRecord(student) != null) {

            if (maxGradeRecord.get(student).doubleValue() <
                    ((HashMap<StudentsPool, Number>) itBaseSubject.getRecord(student)).get(student).doubleValue()
                    ) {
                maxGradeRecord = itBaseSubject.getRecord(student);
            }
        }
        return maxGradeRecord;
    }
}
