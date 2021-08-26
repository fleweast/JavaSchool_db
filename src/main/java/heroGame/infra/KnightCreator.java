package heroGame.infra;

import heroGame.characters.Hero;
import heroGame.characters.Knight;

public class KnightCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Knight();
    }
}
