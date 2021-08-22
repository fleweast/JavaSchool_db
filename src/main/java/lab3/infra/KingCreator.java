package lab3.infra;

import lab3.characters.Hero;
import lab3.characters.King;

public class KingCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new King();
    }
}
