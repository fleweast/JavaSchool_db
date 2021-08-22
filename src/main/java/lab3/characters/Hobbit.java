package lab3.characters;

public class Hobbit extends AbstractHero {

    public Hobbit(){
        setPower(0);
        setHp(3);
    }

    @Override
    public int kick(Hero enemy) {
        toCry();
        return 0;
    }

    private void toCry(){
        System.out.println("Waaaaah, waaah, waaaah");
    }
}
