package lab3.weapons;

import lab3.characters.Hero;
import lab3.utils.RandomUtil;

public class Sword implements Weapon{
    @Override
    public int kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.between(0, attacker.getPower());
        defender.decreaseHp(damage);
        return damage;
    }
}
