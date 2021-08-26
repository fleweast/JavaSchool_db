package heroGame.infra;

import heroGame.characters.Hero;
import heroGame.characters.King;

public class KingCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new King();
    }
}
