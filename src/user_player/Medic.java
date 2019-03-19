package user_player;

import boss.Boss;

public class Medic extends Hero {

    public Medic(int health, int attack) {
        super(health, attack, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes,
                           Boss boss) {
        for (Hero hero : heroes) {
            hero.setHealth(hero.getHealth() + 20);
        }
    }
}
