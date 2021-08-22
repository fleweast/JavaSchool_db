package lab3.characters;

import lab3.characters.Hero;
import lab3.utils.RandomUtil;
import lombok.Data;

@Data
public abstract class AbstractHero implements Hero {
    private int hp;
    private int power;
    private String name;

    public AbstractHero(){
        this.name = RandomUtil.randomName();
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void die(){ hp = 0;}

    @Override
    public void decreasePower(int delta) {
        this.power -= delta;
    }

    @Override
    public void decreaseHp(int delta) {
        this.hp -= delta;
    }
}
