package modeltest;


import static org.junit.Assert.*;
import model.secondchapter.CDPlayerConfig;
import model.secondchapter.CompactDisc;
import model.secondchapter.MediaPlayer;
import model.secondchapter.SoundSystemConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Marcin on 2015-10-19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {


    @Autowired
    CompactDisc disc;

    @Autowired
    MediaPlayer player;



    @Test
    public void shouldCDNotBeNull() {
        assertNotNull(disc);
    }

    @Test
    public void shouldCDFieldNotBeNull() {
        assertNotNull(player.getCd());
    }



}
