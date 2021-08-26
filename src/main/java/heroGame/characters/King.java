package heroGame.characters;

import heroGame.utils.RandomUtil;
import heroGame.weapons.Sword;
import heroGame.weapons.Weapon;


public class King extends AbstractHero {
    private Weapon weapon = new Sword();

    public King(){
        setHp(RandomUtil.between(5, 15));
        setPower(RandomUtil.between(5, 15));
    }

    @Override
    public int kick(Hero enemy) {
        return  weapon.kick(this, enemy);
    }

}
