package homework2;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " is attacking!");
        enemy.takeDamage(15);
    }

    @Override
    public void uniqueAbility() {
        System.out.println("The warrior" + getName() + " puts on armor");
        healthHero = 100;
    }
}
