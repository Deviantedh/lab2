package Pokemons;

import Moves.Thunder;

public class Aromatisse extends Spritzee{
    public Aromatisse(String name, int level) {
        super(name, level);
        setStats(101, 72, 72, 99, 89, 29);
        setMove(new Thunder());
    }
}
