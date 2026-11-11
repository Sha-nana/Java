package mymoves.maractus;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NeedleArm extends PhysicalMove {
    public NeedleArm(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected String describe() {
        return "использует Needle Arm";
    }

    @Override 
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Math.random() < 0.3) {
            Effect.flinch(p);
        }
    }
}