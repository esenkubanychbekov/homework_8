package user_player;

import boss.Boss;

public class Magical extends Hero {

    public Magical(int health, int attack) {
        super(health, attack,
                AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes,
                           Boss boss) {
        for (Hero hero: heroes) {
            hero.setAttack(hero.getAttack()+20);
        }
    }
}
