package heroGame.weapons;

import heroGame.characters.Hero;
import heroGame.utils.RandomUtil;

public class Sword implements Weapon{
    @Override
    public int kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.between(0, attacker.getPower());
        defender.decreaseHp(damage);
        return damage;
    }
}
