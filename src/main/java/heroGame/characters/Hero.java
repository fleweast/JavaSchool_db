package heroGame.characters;

public interface Hero {
    int kick(Hero enemy);
    boolean isAlive();
    int getPower();
    int getHp();
    String getName();
    void die();
    void setPower(int power);
    void setHp(int hp);
    void decreasePower(int delta);
    void decreaseHp(int delta);

}
