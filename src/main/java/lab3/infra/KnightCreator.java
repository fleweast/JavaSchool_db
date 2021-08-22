package lab3.infra;

import lab3.characters.Hero;
import lab3.characters.Knight;

public class KnightCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Knight();
    }
}
