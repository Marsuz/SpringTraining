package modeltest;

import model.knight.BraveKnight;
import model.quest.Quest;
import model.quest.SlayDragonQuest;
import org.junit.Test;
import static org.mockito.Mockito.*;


/**
 * Created by Marcin on 2015-10-18.
 */


public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {

        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }



}
