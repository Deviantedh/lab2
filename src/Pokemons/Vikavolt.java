package Pokemons;

import Moves.PoisonJab;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Charjabug{

    public Vikavolt(String name, int level) {
        super(name, level);
        setStats(74, 70, 90, 145, 75, 43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new PoisonJab());
    }
}
