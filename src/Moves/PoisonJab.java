package Moves;
import ru.ifmo.se.pokemon.*;
public class PoisonJab extends PhysicalMove{
    public PoisonJab(){super (Type.POISON, 80, 100) ;}
    protected String describe(){return "использует PoisonJab";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        if (Math.random() <= 0.3) Effect.poison(var1);
        var1.setMod(Stat.HP, (int) Math.round(damage));
    }
}
