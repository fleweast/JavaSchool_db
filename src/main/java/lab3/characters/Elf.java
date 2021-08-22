package lab3.characters;

public class Elf extends AbstractHero {

    public Elf(){
        setPower(10);
        setHp(10);
    }
    @Override
    public int kick(Hero enemy) {
        if (this.getPower() > enemy.getPower()){
            int damage = enemy.getHp();
            enemy.die();
            return damage;
        } else {
            enemy.decreasePower(1);
            return 0;
        }
    }
}
