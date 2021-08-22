package lab3.infra;

import lab3.characters.Elf;
import lab3.characters.Hero;

public class ElfCreator implements HeroCreator{
    @Override
    public Hero create() {
        return new Elf();
    }
}
