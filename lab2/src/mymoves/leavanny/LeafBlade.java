package mymoves.leavanny;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class LeafBlade extends PhysicalMove {

    public LeafBlade(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 1.0 / 8.0) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "использует Leaf Blade";
    }
}