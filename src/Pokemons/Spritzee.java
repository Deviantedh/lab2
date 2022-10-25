package Pokemons;

import Moves.Facade;
import Moves.Psychic;
import Moves.SweetKiss;
import ru.ifmo.se.pokemon.*;

public class Spritzee extends Pokemon {
    public Spritzee(String name, int level) {
        super(name, level);
        setStats(78, 52, 60, 63, 65, 23);
        setType(Type.FAIRY);
        setMove(new Psychic(), new Facade(), new SweetKiss());
    }
}
