package user_player;

import com.company.Ability;
import com.company.GameEntity;

public abstract class Hero extends GameEntity
        implements Ability {

    protected AbilityType ability;

    public Hero(int health, int attack,
                AbilityType ability) {
        super(health, attack);
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }
}
