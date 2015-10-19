package model.firstchapter.quest;

import java.io.PrintStream;

/**
 * Created by Marcin on 2015-10-18.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Dragon Slayed");
    }
}
