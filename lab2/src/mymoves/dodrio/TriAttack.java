package mymoves.dodrio;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class TriAttack extends SpecialMove {
    public TriAttack(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        double random = Math.random();

        if (random < 0.2) {
            double chance = Math.random();

            if (chance < 1.0 / 3.0) {
                Effect.paralyze(p);
            } else if (chance < 2.0 / 3.0) {
                Effect.burn(p);
            } else {
                Effect.freeze(p);
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Tri Attack";
    }
}