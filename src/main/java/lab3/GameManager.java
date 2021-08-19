package lab3;

public class GameManager {

    public void fight(Hero hero1, Hero hero2){
        System.out.println("The battle between " + hero1.getName() + " with power and hp: "+ hero1.getPower() + " "+ hero1.getHp()
                + " and Hero2: " + hero2.getName() + " with power and hp: "+ hero2.getPower() + " "+ hero2.getHp());

        while (hero1.isAlive() && hero2.isAlive()){
            System.out.println(hero1.kick(hero2));
            System.out.println(hero2.kick(hero1));
        }
    }
}
