package lab3;

import lombok.Data;

@Data
public abstract class Hero {
    private String name;
    private int power;
    private int hp;

    public abstract String kick (Hero c);

    public void takeDamage (int damage){
        hp -= damage;
    }

    boolean isAlive(){
        return hp > 0;
    }
}
