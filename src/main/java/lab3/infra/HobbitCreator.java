package lab3.infra;

import lab3.characters.Hero;
import lab3.characters.Hobbit;

public class HobbitCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Hobbit();
    }
}
