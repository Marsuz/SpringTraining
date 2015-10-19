package model.secondchapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by Marcin on 2015-10-19.
 */


@Component
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

}
