package model.secondchapter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Marcin on 2015-10-19.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
