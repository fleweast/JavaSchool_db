package heroGame.infra;

import heroGame.characters.Hero;
import heroGame.characters.Hobbit;

public class HobbitCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Hobbit();
    }
}
