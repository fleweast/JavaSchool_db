package lab3.characters;

import lab3.utils.RandomUtil;
import lab3.weapons.Sword;
import lab3.weapons.Weapon;


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
