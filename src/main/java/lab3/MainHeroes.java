package lab3;

import lab3.characters.Hero;
import lab3.infra.HeroFactory;
import lab3.infra.SimpleHeroFactory;

public class MainHeroes {
    public static void main(String[] args) {

        SimpleHeroFactory heroFactory = new SimpleHeroFactory();
        Hero hero1 =heroFactory.createHero();
        Hero hero2 =heroFactory.createHero();

        GameManager gameManager = new GameManager();
        gameManager.fight(hero1, hero2);
    }
}

