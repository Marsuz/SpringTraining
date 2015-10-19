package model.firstchapter.knight;

import model.firstchapter.quest.Quest;

/**
 * Created by Marcin on 2015-10-18.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
