package modeltest;

import model.firstchapter.knight.BraveKnight;
import model.firstchapter.quest.Quest;
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
