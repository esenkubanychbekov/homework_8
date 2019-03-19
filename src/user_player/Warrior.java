package user_player;

import boss.Boss;

public class Warrior extends Hero {

    public Warrior(int health, int attack) {
        super(health, attack,
                AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes,
                           Boss boss) {
        for (Hero hero : heroes) {
           int attact = boss.getAttack();
           hero.setAttack(hero.getAttack()+attact);


        }
    }

}
