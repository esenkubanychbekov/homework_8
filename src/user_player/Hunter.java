package user_player;

import boss.Boss;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {
        super(health, attack,
                AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes,
                           Boss boss) {

    }

    @Override
    public int getAttack() {
        Random random = new Random();
        int randomInt = random.nextInt(3) + 1;
        return this.attack * randomInt;
    }
}
