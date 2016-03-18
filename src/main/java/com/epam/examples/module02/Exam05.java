package com.epam.examples.module02;

import com.epam.examples.module02.subjects.pools.StudentsPool;
import com.epam.examples.module02.subjects.Subjects;

/**
 * Created by Vsevolod on 14/03/16.
 */
public class Exam05 {
    public static void run() {
        System.out.println("\n\t____________EXAMPLE-05____________\n");

        Subjects typicalSubjects = new Subjects();
        typicalSubjects.fill();
        typicalSubjects.find(StudentsPool.AlexBrin);
        typicalSubjects.find(StudentsPool.LillyWachowski);
    }
}
