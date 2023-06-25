package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

     private static boolean isBossStunned = false;

    public static boolean isBossStunned() {
        return isBossStunned;
    }

    public static void setIsBossStunned(boolean isBossStunned) {
        Thor.isBossStunned = isBossStunned;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        isBossStunned = RPG_Game.random.nextBoolean();
        System.out.println("THOR STUNNED BOSS" + isBossStunned);
    }
}
