package heroGame.infra;

import heroGame.characters.Elf;
import heroGame.characters.Hero;

public class ElfCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Elf();
    }
}
