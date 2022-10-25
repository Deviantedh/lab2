package Moves;
import ru.ifmo.se.pokemon.*;
public class IronDefense extends StatusMove{
    public IronDefense(){super (Type.STEEL, 0, 100) ;}
    protected String describe(){return "использует iron defence";}
    protected void applySelfEffects(Pokemon att) {
        att.setCondition(new Effect().stat(Stat.DEFENSE, 1));
    }
}
