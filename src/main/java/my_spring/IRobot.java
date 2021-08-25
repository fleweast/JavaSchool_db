package my_spring;

public class IRobot {
    @InjectByType
    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    @InjectByType
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom(){
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
