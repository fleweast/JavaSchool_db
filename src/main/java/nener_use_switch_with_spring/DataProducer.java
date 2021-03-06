package nener_use_switch_with_spring;

import com.github.javafaker.Faker;
import heroGame.utils.RandomUtil;

import java.util.List;

public class DataProducer {
    private static List<String> channels = List.of("sms", "tel");
    private static Faker faker = new Faker();

    public static Message generateMessage() {
        return Message.builder()
                .channelName(RandomUtil.getRandomElement(channels))
                .content(faker.chuckNorris().fact())
                .build();
    }
}
