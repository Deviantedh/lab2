package Moves;
import ru.ifmo.se.pokemon.*;
public class Thunder extends SpecialMove{
    public Thunder(){super (Type.ELECTRIC, 110, 70) ;}
    protected String describe(){return "использует Thunder";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.3) Effect.paralyze(var1);

    }
}
