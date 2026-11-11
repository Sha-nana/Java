package mypokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.maractus.GrassWhistle;
import mymoves.sewaddle.CalmMind;
import mymoves.sewaddle.DoubleTeam;

public class Swadloon extends Pokemon {
    public Swadloon(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(55, 63, 90, 50, 80, 42);

        CalmMind calmmind = new CalmMind();
        DoubleTeam doubleteam = new DoubleTeam();
        GrassWhistle grasswhistle = new GrassWhistle(0, 55);

        super.setMove(doubleteam, calmmind, grasswhistle);
    }
}