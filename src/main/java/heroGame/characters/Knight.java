package heroGame.characters;

import heroGame.utils.RandomUtil;
import heroGame.weapons.Sword;
import heroGame.weapons.Weapon;


public class Knight extends AbstractHero {
    Weapon weapon = new Sword();

    public Knight(){
        setHp(RandomUtil.between(2, 12));
        setPower(RandomUtil.between(2, 12));
    }

    @Override
    public int kick(Hero enemy) {
        return  weapon.kick(this, enemy);
    }
}
