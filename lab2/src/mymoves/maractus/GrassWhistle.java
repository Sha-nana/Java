package mymoves.maractus;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class GrassWhistle extends StatusMove{
      public GrassWhistle(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }


    @Override 
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "использует Grass Whistle ";
    }
}