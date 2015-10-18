import model.knight.BraveKnight;
import model.knight.Knight;
import model.quest.SlayDragonQuest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Marcin on 2015-10-18.
 */
public class KnightsMain {



    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();



    }

}
