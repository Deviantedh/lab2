package Moves;
import ru.ifmo.se.pokemon.*;
public class WildCharge extends PhysicalMove{
    public WildCharge(){super (Type.FIRE, 90, 100) ;}
    protected String describe(){return "использует WildCharge";}
    protected void applyOppDamage(Pokemon var1, double damage) {
        var1.setMod(Stat.HP, (int) Math.round(damage));
    }
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage/4));
    }
}
