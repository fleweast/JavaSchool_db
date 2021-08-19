package lab3;

import java.util.Random;

public class King extends Hero{
    static Random rn = new Random();

    public King(String name){
        this.setName(name);
        this.setPower(rn.nextInt(15 - 5 + 1) + 5);
        this.setHp(rn.nextInt(15 - 5 + 1) + 5);
    }
    @Override
    public String kick(Hero c) {
        int damage = rn.nextInt(this.getPower() + 1);
        c.takeDamage(damage);
        return "King kicked " + c.getName() + " for " + damage + " hp";
    }
}
