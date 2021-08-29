package real_spring;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;


public class TalkingRobot {

    @InjectRandomName
    private String name;

    @Setter
    private List<Quoter> quoters;

    @PostConstruct
    public void talk(){
        System.out.println(name);
        quoters.forEach(Quoter::sayQuote);
    }
}
