package Moves;
import ru.ifmo.se.pokemon.*;
public class SweetKiss extends StatusMove{
    public SweetKiss(){super (Type.FAIRY, 0, 75) ;}
    protected String describe(){return "использует Sweet kiss";}
    protected void applyOppEffects(Pokemon var1) {
        Effect.confuse(var1);
    }
}
