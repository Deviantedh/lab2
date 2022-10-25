package Moves;
import ru.ifmo.se.pokemon.*;
public class FireFang extends PhysicalMove{
    public FireFang(){super (Type.FIRE, 65, 95) ;}
    protected String describe(){return "использует FireFang";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random() <= 0.1) Effect.burn(var1);
        if (Math.random() <= 0.1) Effect.flinch(var1);
    }
}
