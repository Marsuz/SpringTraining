package model.secondchapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Marcin on 2015-10-29.
 */

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

}
