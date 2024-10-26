package homework2;

public class Vampire extends Enemy {
    public Vampire(int health) {
        super(health);
    }

    @Override
    public void ability(Hero hero) {
        int i = 0;
        while (i <= 5) {
            hero.healthHero -= 10;
            i++;
        }
    }
}
