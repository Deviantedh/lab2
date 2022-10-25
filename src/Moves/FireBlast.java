package Moves;
import ru.ifmo.se.pokemon.*;
public class FireBlast extends SpecialMove{
    public FireBlast(){super (Type.FIRE, 110, 85) ;}
    protected String describe(){return "использует FireBlast";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) Effect.burn(var1);
    }
}
