package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.maractus.*;


public class Maractus extends Pokemon {
    public Maractus(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(75, 86, 67, 106, 67, 60);

        NeedleArm needleArm = new NeedleArm(60, 100);
        GrassWhistle grasswhistle = new GrassWhistle(0, 55);
        Absorb absorb = new Absorb(20, 100);
        AerialAce aerialace = new AerialAce(60, 100);

        super.setMove(needleArm, grasswhistle, absorb, aerialace);
    }
}
