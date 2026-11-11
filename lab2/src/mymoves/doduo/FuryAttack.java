package mymoves.doduo;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FuryAttack extends PhysicalMove {
    public FuryAttack() {
        super(Type.NORMAL, 15, 85, 0, getHits());
    }
    private static int getHits() {
    double random = Math.random();

    if (random < 3.0 / 8.0) {
        return 2;
    } else if (random < 6.0 / 8.0) {
        return 3;
    } else if (random < 7.0 / 8.0) {
        return 4;
    } else {
        return 5;
    }
}

    @Override
    protected String describe() {
        return "использует Fury Attack";
    }
} 
