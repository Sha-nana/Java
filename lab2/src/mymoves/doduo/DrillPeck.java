package mymoves.doduo;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DrillPeck extends PhysicalMove {
    public DrillPeck(double pow, double acc) {
        super(Type.FLYING, pow, acc);
    }

    @Override
    protected String describe() {
        return "использует Drill Peck";
    }
} 

