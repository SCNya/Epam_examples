package com.epam.examples.module02.submarines;

import java.lang.annotation.*;

/**
 * Created by Vsevolod on 18/03/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyAnnotation {
    String author();
    String date();
    int currentRevision() default 1;
    String[] reviewers() default "Vyacheslav Lapin";
}
