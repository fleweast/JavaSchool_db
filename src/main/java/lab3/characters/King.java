package lab3.characters;

import lab3.characters.AbstractHero;
import lab3.characters.Hero;
import lab3.utils.RandomUtil;
import lab3.weapons.Sword;
import lab3.weapons.Weapon;


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
