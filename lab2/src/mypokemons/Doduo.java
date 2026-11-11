package mypokemons;

import mymoves.dodrio.TriAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.doduo.DrillPeck;
import mymoves.doduo.FuryAttack;
import mymoves.doduo.Rest;


public class Doduo extends Pokemon {
    public Doduo(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(35, 85, 45, 35, 35, 75);
        Rest rest = new Rest();
        DrillPeck drillpeck = new DrillPeck(80, 100);
        FuryAttack furyattack = new FuryAttack();
       
        super.setMove(rest, drillpeck, furyattack);
    }
}