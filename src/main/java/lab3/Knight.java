package lab3;

import java.util.Random;

public class Knight extends Hero {
    static Random rn = new Random();

    public Knight(String name){
        this.setName(name);
        this.setPower(rn.nextInt(12 - 2 + 1) + 2);
        this.setHp(rn.nextInt(12 - 2 + 1) + 2);
    }
    @Override
    public String kick(Hero c) {
        int damage = rn.nextInt(this.getPower() + 1);
        c.takeDamage(damage);
        return "Knight kicked " + c.getName() + " for " + damage + " hp";
    }
}
