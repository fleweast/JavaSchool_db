package heroGame;

import heroGame.characters.Hero;

public class GameManager {

    public void fight(Hero hero1, Hero hero2){
        Hero winner;
        System.out.println("The battle between " + hero1.getName() + " with power "+ hero1.getPower() + " and hp "+ hero1.getHp()
                + ". Hero2: " + hero2.getName() + " with power "+ hero2.getPower() + " and hp "+ hero2.getHp());

        while (hero1.isAlive() && hero2.isAlive()){
            System.out.println(hero1.getName() + " kick " + hero2.getName() + " with power " + hero1.kick(hero2));
            System.out.println(hero2.getName() + " kick " + hero1.getName() + " with power " + hero2.kick(hero1));
        }

        if (hero1.getHp() > hero2.getHp()){
            winner = hero1;
        } else {
            winner = hero2;
        }

        System.out.println("The battle finished. Won " + winner.getName());
    }
}
