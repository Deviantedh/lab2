import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Entei("Скилёвий", 50);
        Pokemon p2 = new Aromatisse("Беливикс", 100);
        Pokemon p3 = new Spritzee("Феечка", 100);
        Pokemon p4 = new Grubbin("Бедни", 100);
        Pokemon p5 = new Charjabug("Ползучиии", 100);
        Pokemon p6 = new Vikavolt("Парящиииий", 100);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}