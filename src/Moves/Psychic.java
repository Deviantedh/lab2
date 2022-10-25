package Moves;
import ru.ifmo.se.pokemon.*;
public class Psychic extends SpecialMove{
    public Psychic(){super (Type.PSYCHIC, 90, 100) ;}
    protected String describe(){return "использует Psychic";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) var1.setCondition(new Effect().stat(Stat.SPECIAL_DEFENSE, -1));
    }
}
