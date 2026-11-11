package mypokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.sewaddle.CalmMind;
import mymoves.sewaddle.DoubleTeam;

public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(45, 53, 70, 40, 60, 42);

        CalmMind calmmind = new CalmMind();
        DoubleTeam doubleteam = new DoubleTeam();

        super.setMove(doubleteam, calmmind);
    }
}
