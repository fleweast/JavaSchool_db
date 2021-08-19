package lab3;

public class Elf extends Hero{

    public Elf(String name){
        this.setName(name);
        this.setPower(10);
        this.setHp(10);
    }
    @Override
    public String kick(Hero c) {
        if (this.getPower() > c.getPower()){
            c.takeDamage(c.getHp());
            return "Elf kill " + c.getName();
        } else {
            c.setPower(c.getPower()-1);
            return "Elf decrease power by 1 to " + c.getName();
        }
    }
}
