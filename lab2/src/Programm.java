import ru.ifmo.se.pokemon.Battle;
import mypokemons.*;


public class Programm {
    public static void main(String[] args) {
        Battle b = new Battle();
        Maractus maractus = new Maractus("Кактус", 1);
        Doduo doduo = new Doduo("ТвинБерд", 1);
        Dodrio dodrio = new Dodrio("ТриплБерд", 1);
        b.addAlly(dodrio);
        b.addAlly(doduo);
        b.addAlly(maractus);
        Sewaddle sewaddle = new Sewaddle("Салат", 1);
        Swadloon swadloon = new Swadloon("Свади", 1);
        Leavanny leavanny = new Leavanny("Ливанни", 1);
        b.addFoe(leavanny);
        b.addFoe(swadloon);
        b.addFoe(sewaddle);
        b.go();
    }
    
}
