package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && !(heroes[i] instanceof Witcher) ){
                heroes[i].setDamage(heroes[i].getDamage() + RPG_Game.random.nextInt(3) + 3);
            }
        }

    }
}
