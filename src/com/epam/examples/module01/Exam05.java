package com.epam.examples.module01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Vsevolod on 02/03/16.
 */
public final class Exam05 implements Exam {

    @Override
    public void run() {
        System.out.println("\n____________EXAMPLE-05____________\n");

        Notepad note = new Notepad();

        System.out.println("____________Adding...____________");

        note.add("Hello world RECORD!");
        note.add("Second record");

        note.view();

        System.out.println("\n____________Editing...____________");

        note.edit(0, "Edited record 0");
        note.view();

        System.out.println("\n____________Delete record 0____________");

        note.delete(0);
        note.view();
    }

    private final class Notepad {

        private final class Data {

            private String record;

            public Data(String record) {
                this.record = record;
            }

            public String getRecord() {
                return record;
            }

            public void setRecord(String record) {
                this.record = record;
            }
        }

        private List<Data> records;
        private ListIterator<Data> it;

        public Notepad() {
            records = new ArrayList<>();
        }

        public void add(String str){
            records.add(new Data(str));
        }

        public void delete(int position){
            if((position < records.size()) && (position >= 0))
            records.remove(position);
            else
            System.err.println("Delete: record not fond");
        }

        public void edit(int position, String str) {
            if((position < records.size()) && (position >= 0))
                records.get(position).setRecord(str);
            else
                System.err.println("Edit: record not fond");
        }

        public void view() {
            it = records.listIterator();

            System.out.println("\nRecord list: ");

            while (it.hasNext())
            {
                System.out.println("\n\t" + it.nextIndex() + ':');
                System.out.println("\t\"" + it.next().getRecord() + '\"');
            }

        }
    }
}