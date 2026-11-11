package mypokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.maractus.GrassWhistle;
import mymoves.sewaddle.CalmMind;
import mymoves.sewaddle.DoubleTeam;
import mymoves.leavanny.LeafBlade;

public class Leavanny extends Pokemon {
    public Leavanny(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(75, 103, 80, 70, 80, 92);

        CalmMind calmmind = new CalmMind();
        DoubleTeam doubleteam = new DoubleTeam();
        GrassWhistle grasswhistle = new GrassWhistle(0, 55);
        LeafBlade leafblade = new LeafBlade(90, 100);

        super.setMove(doubleteam, calmmind, grasswhistle, leafblade);
    }
}
