package Moves;
import ru.ifmo.se.pokemon.*;
public class Bite extends PhysicalMove{
    public Bite(){super (Type.DARK, 60, 100) ;}
    protected String describe(){return "использует Bite";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.3) Effect.flinch(var1);
    }
}
