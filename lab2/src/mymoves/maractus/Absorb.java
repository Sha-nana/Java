package mymoves.maractus;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Absorb extends SpecialMove {
    public Absorb(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }


    @Override
	protected void applyOppDamage(Pokemon p, double damage) {
		super.applyOppDamage(p, damage);    
    }
    
    @Override 
    protected void applySelfDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int)(-damage * 0.5));

    }

    
    @Override
    protected String describe() {
        return "использует Absorb ";
    }
    
}
