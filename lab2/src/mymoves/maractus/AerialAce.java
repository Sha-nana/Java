package mymoves.maractus;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc){
        super(Type.FLYING, pow, acc);
}
@Override
protected String describe() {
    return "использует Aerial Ace";
}
@Override
protected boolean checkAccuracy(Pokemon att, Pokemon def) {
    return true;
}

}


