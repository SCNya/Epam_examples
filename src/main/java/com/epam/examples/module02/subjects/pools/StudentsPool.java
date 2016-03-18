package com.epam.examples.module02.subjects.pools;

/**
 * Created by Vsevolod on 15/03/16.
 */

public enum StudentsPool {
    AlexBrin("Alex Brin"),
    AlexVoll("Alex Voll"),
    LillyWachowski("Lilly Wachowski");

    private final String fullName;

    private StudentsPool(String value) {
        fullName = value;
    }

    public String getName() {
        return fullName;
    }
}
