package mymoves.doduo;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
}

@Override
protected void applySelfEffects(Pokemon p) {
    p.setMod(Stat.HP, (int) (p.getStat(Stat.HP) - p.getHP()));
    Effect effect = new Effect()
            .condition(Status.SLEEP)
            .turns(2)
            .attack(0);

    p.addEffect(effect);
}

@Override
protected String describe() {
    return "использует Rest";
}


}
