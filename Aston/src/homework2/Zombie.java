package homework2;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void ability(Hero hero) {
        if(getHealth() == 0) {
            setHealth(100);
        }
    }


}
