package com.company;

import boss.Boss;
import user_player.Hero;
import user_player.Hunter;
import user_player.Magical;
import user_player.Medic;
import user_player.Warrior;

public class RpgGame {

    public static void startGame() {
        Hero heroes[] = getHeroesMassive();
        Boss boss = new Boss(400, 33);

        showStatistics(heroes, boss);

        while (!isFinish(heroes, boss)) {
            fight(heroes, boss);
        }
    }

    private static boolean isFinish(Hero heroes[],
                                    Boss boss) {
        if(boss.getHealth() <= 0) {
            return true;
        }

        boolean allHeroesWasDied = true;
        for (Hero hero : heroes) {
            if(hero.getHealth() > 0) {
                allHeroesWasDied = false;
            }
        }
        return allHeroesWasDied;
    }

    private static void fight(Hero heroes[],
                              Boss boss) {
        bossBit(heroes, boss);

        heroesBit(heroes, boss);

        applyAbility(heroes, boss);

        showStatistics(heroes, boss);
    }

    private static void applyAbility(Hero heroes[],
                                     Boss boss) {
        for (Hero hero : heroes) {
            hero.useAbility(heroes, boss);
        }
    }

    private static void heroesBit(Hero heroes[],
                                  Boss boss) {
        for (Hero hero : heroes) {
            boss.setHealth(boss.getHealth()
                - hero.getAttack());
        }
    }

    private static void bossBit(Hero heroes[],
                                Boss boss) {
        for (Hero hero : heroes) {
            hero.setHealth(hero.getHealth()
                - boss.getAttack());
        }
    }

    private static void showStatistics(Hero heroes[],
                                       Boss boss) {
        System.out.println("_________________");
        for (Hero hero : heroes) {
            System.out.println("Hero "
                    + hero.getClass()
                    .getSimpleName().toString()
                    + " current health: "
                    + hero.getHealth());
        }
        System.out.println("Boss health: "
                + boss.getHealth());
        System.out.println("_________________");
    }

    private static Hero[] getHeroesMassive() {
        return new Hero[] {
            new Hunter(100, 10),
            new Magical(100, 10),
            new Warrior(100, 10),
            new Medic(100, 10)
        };
    }
}
