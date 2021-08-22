package lab3.infra;

import lab3.characters.Hero;
import lab3.utils.RandomUtil;

import java.util.List;

public class SimpleHeroFactory implements HeroFactory {

    private List<HeroCreator> heroCreators = List.of(
            new HobbitCreator(), new ElfCreator(), new KingCreator(), new KnightCreator());


    @Override
    public Hero createHero() {
        return RandomUtil.getRandomElement(heroCreators).create();
    }
}
