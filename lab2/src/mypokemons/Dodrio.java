package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.dodrio.TriAttack;
import mymoves.doduo.DrillPeck;
import mymoves.doduo.FuryAttack;
import mymoves.doduo.Rest;


public class Dodrio extends Pokemon {
    public Dodrio(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(60, 110, 70, 60, 60, 110);
        Rest rest = new Rest();
        DrillPeck drillpeck = new DrillPeck(80, 100);
        FuryAttack furyattack = new FuryAttack();
        TriAttack triattack = new TriAttack(80, 100);


        super.setMove(rest, drillpeck, furyattack, triattack);
    }
}