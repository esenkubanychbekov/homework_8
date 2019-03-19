package boss;

import com.company.GameEntity;

import java.util.Random;

public class Boss extends GameEntity {

    public Boss(int health, int attack) {
        super(health, attack);
    }

    @Override
    public int getAttack() {
        Random random = new Random();
        int randomInt = random.nextInt(3) + 1;
        return this.attack * randomInt;
    }
}
