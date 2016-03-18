package com.epam.examples.module02.submarines;

/**
 * Created by Vsevolod on 18/03/16.
 */

@MyAnnotation (
        author = "Alexeenko Vsevolod",
        date = "18//03//2016",
        currentRevision = 2
)
public class AtomSubmarine {

    private boolean status;

    public AtomSubmarine() {
        status = false;
    }

    public void sail() {
        System.out.println("Preparing to sail...");
        Engine engine = new Engine();
        engine.start();
        if(status) {
            System.out.println("Status is OK\n We sail!");
        }
        else {
            System.out.println("Something wrong");
        }
    }
    private class Engine {
        void start() {
            System.out.println("\tStart engine...");
            status = true;
            System.out.println("\tEngine was started");
        }
    }
}
