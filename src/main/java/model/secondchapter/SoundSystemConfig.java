package model.secondchapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Marcin on 2015-10-29.
 */

@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
public class SoundSystemConfig {
}
