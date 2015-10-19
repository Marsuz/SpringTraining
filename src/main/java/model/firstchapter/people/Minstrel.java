package model.firstchapter.people;

import java.io.PrintStream;

/**
 * Created by Marcin on 2015-10-19.
 */
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {

        printStream.println("The knight is so brave!");

    }

    public void singAfterQuest() {

        printStream.println("Knight did embark on a quest!");


    }

}

